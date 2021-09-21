package ru.mirea.task3;

import ru.mirea.task3.opt1.Circle;
import ru.mirea.task3.opt2.Hands;
import ru.mirea.task3.opt2.Human;
import ru.mirea.task3.opt2.Legs;
import ru.mirea.task3.opt2.Head;

public class TestTask3 {
    public int Test ()
    {
        Circle c1 = new Circle(3, 3, 5);
       System.out.println(c1.getCentreX());
       c1.setCentreY(6.43);
       System.out.println(c1.getCentreY());
       System.out.println(c1.getR());
       c1.setCentreX(4.32);
        return 0;
    }

}
