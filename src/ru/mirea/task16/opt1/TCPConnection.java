package ru.mirea.task16.opt1;

import java.io.*;
import java.net.Socket; // умеет устанавливать соединение
import java.nio.charset.Charset;

public class TCPConnection {
    private final Socket socket;
    private final Thread rxThread; // поток, постоянно читающий поток ввода
    private TCPConnectionListener eventListener;
    private final BufferedReader in; // поток ввода работающий со строками
    private final BufferedWriter out; // поток вывода работающий со строками

    public TCPConnection(TCPConnectionListener eventListener, String ipAddr, int port) throws  IOException{
        this(eventListener, new Socket(ipAddr, port));
    }

    public TCPConnection(TCPConnectionListener eventListener, Socket socket) throws IOException { // на вход
        // принимает готовый объект socket и создаёт с ним соединение
        this.eventListener = eventListener;
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8")));
        // получаем входящий поток(get.InputStream()) для чтения байтов из сокета, этот метод умеет генирировать
        // исключения IOException - это обрабатываемые исключения и мы обязаны либо перехватить их
        // либо обработать, скидываем эту задачу на IOException (стр. 18 throws IOException)
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")));
        // получаем исходящий поток(get.OutputStream()) для записи байтов в сокет,
        // OutputStream/InputStream - это базовые потоки, а BufferedReader - уже умеет работать со строками
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eventListener.onConnectionReady(TCPConnection.this);
                    while (!rxThread.isInterrupted()){
                        //String msg = in.readLine();
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                    }
                }
                catch (IOException e){
                    eventListener.onException(TCPConnection.this, e);
                }finally {
                    eventListener.onDisconnect(TCPConnection.this);
                }

            }
        });
        rxThread.start();
    }

    public  synchronized void sendString(String value){
        try {
            out.write(value + "\r\n");
            out.flush();
        } catch (IOException e){
            eventListener.onException(TCPConnection.this, e);
            disconnect();
        }
    }

    public synchronized void disconnect(){
        rxThread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
        }
    }

    @Override
    public String toString(){
        return "TCPConnection: " + socket.getInetAddress() + ": " + socket.getPort();
    }
}
