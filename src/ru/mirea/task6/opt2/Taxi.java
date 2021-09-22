package ru.mirea.task6.opt2;

public class Taxi implements Priceable {
    private int Price;

    public Taxi(int Price)
    {
        this.Price = Price;
    }

    public String getPrice() {
        return Price + " rubles for 200 meters";
    }
}
