package ru.mirea.task4;

import ru.mirea.task4.Ball;
import ru.mirea.task4.Author;

public class TestTask4 {
    public static void main(String [] args)
    {
        Author a1 = new Author("Roman","Romank@gmail.com", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("Roman1k@mail.ru");
        System.out.println(a1.toString());

        Ball b1 = new Ball(2.3, 4.5);
        b1.move(4.3,2.1);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        Ball b2 = new Ball();
        b2.setXY(2.4, 5.6);
        System.out.println(b2.toString());


    }
}
