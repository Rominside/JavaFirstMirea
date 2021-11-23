package ru.mirea.task13.opt2;

public class TestClass132 {
    protected int ObjectNumber;
    protected String ObjectName;
    public TestClass132(int ObjectNumber, String ObjectName){
        this.ObjectName = ObjectName;
        this.ObjectNumber = ObjectNumber;
    }

    public int getObjectNumber() {
        return ObjectNumber;
    }

    public String getObjectName() {
        return ObjectName;
    }

    @Override
    public String toString() {
        return "TestClass132{" +
                "ObjectNumber=" + ObjectNumber +
                ", ObjectName='" + ObjectName + '\'' +
                '}';
    }
}
