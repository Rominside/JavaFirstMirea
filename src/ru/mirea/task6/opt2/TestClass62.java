package ru.mirea.task6.opt2;

import ru.mirea.task6.opt2.bike;
import ru.mirea.task6.opt2.Taxi;
import ru.mirea.task6.opt2.apartment;


public class TestClass62 {
    public static void main(String[] args) {

        Priceable p1 = new bike(50000);
        Priceable p2 = new apartment(5000);
        Priceable p3 = new Taxi(150);

        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
        System.out.println(p3.getPrice());
    }
}
