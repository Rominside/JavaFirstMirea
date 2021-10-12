package ru.mirea.task5.opt2;

public class TestTask52 {
    public static void main(String [] args)
    {
        Dog d1 = new bulldog(11, "dog1");
        Dog d2 = new pug(7, "dog2");
        Dog d3 = new germanShepherd(6,"dog3");

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        d1.setAge(8);
        d1.setName("Bob");
        d1.hungry();
        System.out.println(d1.toString());

        d2.setName("Martin");
        d2.setAge(13);
        System.out.println(d2.getAge());
        System.out.println(d2.getName());
    }
}
