package ru.mirea.task6;

public class Animals implements Nameable{
    private String name;
    public Animals(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
