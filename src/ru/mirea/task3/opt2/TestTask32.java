package ru.mirea.task3.opt2;

public class TestTask32 {
    public static void main(String [] args)
    {
        Human h1 = new Hands();
        Human h2 = new Legs();
        Human h3 = new Head();
        h1.setSize(45);
        h1.setWeight(10);
        System.out.println(h1.toString());
        h2.setSize(60);
        h2.setWeight(20);
        System.out.println(h2.toString());
        h3.setSize(25);
        h3.setWeight(15);
        System.out.println(h3.toString());

    }
}
