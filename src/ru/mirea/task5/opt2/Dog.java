package ru.mirea.task5.opt2;

public abstract class Dog {
    protected Boolean hungry = false;
    protected String name;
    protected int age;
    public abstract void feed();
    public abstract void hungry();
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getAge();
    public abstract void setAge(int age);

    @Override
    public abstract String toString();

}
