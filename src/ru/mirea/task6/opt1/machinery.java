package ru.mirea.task6.opt1;

public class machinery implements Nameable {
    private String name;
    public machinery(String name)
    {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
