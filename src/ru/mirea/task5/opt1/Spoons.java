package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Dish;

public class Spoons extends Dish {
    private int length = 0;
    public Spoons(int length)
    {
        this.length = length;
    }
    @Override
    public void UseDishes() {
        this.clean = false;
    }

    @Override
    public void ToWashTheDishes() {
        this.clean = true;
    }

    @Override
    public String ReturnSize() {
        return "Spoons{ length = " + length + "}";
    }
}
