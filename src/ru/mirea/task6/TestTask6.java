package ru.mirea.task6;

public class TestTask6 {
    public int Test ()
    {
        Nameable n1 = new Animals("dog");
        Nameable n2 = new machinery("BUS");
        Nameable n3 = new Planets("Mars");
        System.out.println(n1.getName());
        System.out.println(n2.getName());
        System.out.println(n3.getName());

        return 0;
    }
}
