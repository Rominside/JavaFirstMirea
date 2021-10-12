package ru.mirea.task3.opt2;

public abstract class Human {
    private double size;
    private double weight;

    public abstract double getSize();

    public abstract double getWeight();

    public abstract void setSize(double size);

    public abstract void setWeight(double weight);

    @Override
    public abstract String toString();
}
