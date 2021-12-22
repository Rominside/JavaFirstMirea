package ru.mirea.task16.opt1;

public class ClientExceptions extends Exception{
    String msg;
    String UserName;
    TCPConnection tcpConnection;
    public ClientExceptions(String msg, String UserName, TCPConnection tcpConnection){
        super(msg);
        System.out.println(msg);
        this.UserName = UserName;
        this.tcpConnection = tcpConnection;

    }
}
