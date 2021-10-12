package ru.mirea.task3.opt2;

public class Legs extends Human {
    private double size;
    private double weight;

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Legs{" +
                "size of leg=" + size +
                ", weight of leg=" + weight +
                '}';
    }
}
