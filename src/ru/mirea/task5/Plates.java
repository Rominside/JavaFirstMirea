package ru.mirea.task5;

public class Plates extends Dish{
    private int diameter;

    public Plates(int diameter)
    {
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String ReturnSize() {
        return "Plates{ diameter = " + diameter + "}";
    }

    @Override
    public void ToWashTheDishes() {
        this.clean = true;
    }

    @Override
    public void UseDishes() {
        this.clean = false;
    }
}
