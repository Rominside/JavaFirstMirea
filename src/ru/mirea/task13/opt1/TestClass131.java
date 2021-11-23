package ru.mirea.task13.opt1;

public class TestClass131 {
    protected int ObjectNumber;
    protected String ObjectName;
    public TestClass131(int ObjectNumber, String ObjectName){
        this.ObjectNumber = ObjectNumber;
        this.ObjectName = ObjectName;
    }

    public String getObjectName() {
        return ObjectName;
    }

    public int getObjectNumber() {
        return ObjectNumber;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "ObjectNumber=" + ObjectNumber +
                ", ObjectName='" + ObjectName + '\'' +
                '}';
    }
}
