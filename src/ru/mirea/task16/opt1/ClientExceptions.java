package ru.mirea.task16.opt1;

public class ClientExceptions extends Exception{
    String msg;
    String UserName;
    public ClientExceptions(String msg, String UserName){
        super(msg);
        this.UserName = UserName;
    }
}
