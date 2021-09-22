package ru.mirea.task6.opt1;

import ru.mirea.task6.opt1.Animals;
import ru.mirea.task6.opt1.Nameable;
import ru.mirea.task6.opt1.Planets;
import ru.mirea.task6.opt1.machinery;

public class TestTask6 {
    public static void main (String[] args)
    {
        Nameable n1 = new Animals("dog");
        Nameable n2 = new machinery("BUS");
        Nameable n3 = new Planets("Mars");
        System.out.println(n1.getName());
        System.out.println(n2.getName());
        System.out.println(n3.getName());

    }
}
