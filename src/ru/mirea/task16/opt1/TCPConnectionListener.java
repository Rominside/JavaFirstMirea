package ru.mirea.task16.opt1;

public interface TCPConnectionListener { // интерфейс нужен для того чтобы Client и Server могли по разному
    // реализовывать методы (прим: когда серверу приходит сообщение но должен разсылать его всем клиентам,
    // когда клиенту приходит сообщение он записывает его к себе в окно вывода)
    void onConnectionReady(TCPConnection tcpConnection); // передаём экземпляр самого соединения для того
    // чтобы у той сущности, которая будет реализовывать интерфейс, был доступ к соединению(источнику события)
    void onReceiveString(TCPConnection tcpConnection, String value);
    void onDisconnect(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception e);
}