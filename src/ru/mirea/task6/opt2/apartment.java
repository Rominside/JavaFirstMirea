package ru.mirea.task6.opt2;

public class apartment implements Priceable {
    private int Price;
    public apartment(int Price)
    {
        this.Price = Price;
    }
    public String getPrice()
    {
        return Price + " rubles per day";
    }
}
