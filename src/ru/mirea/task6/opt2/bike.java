package ru.mirea.task6.opt2;

public class bike implements Priceable {
    private int Price;
    public bike(int Price)
    {
        this.Price = Price;
    }
    public String getPrice()
    {
        return Price + " rubles" ;
    }
}
