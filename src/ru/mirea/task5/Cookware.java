package ru.mirea.task5;

public class Cookware extends Dish{
    private int depth = 0;
    private int diameter = 0;
    public Cookware(int depth, int diameter)
    {
        this.depth = depth;
        this.diameter = diameter;
    }

    public int getDepth() {
        return depth;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void UseDishes() {
        this.clean = false;
    }

    @Override
    public void ToWashTheDishes() {
        this.clean = true;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String ReturnSize() {
        return "Cookware{" +
                "depth=" + depth +
                ", diameter=" + diameter +
                '}';
    }
}
