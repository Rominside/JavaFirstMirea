package ru.mirea.task5.opt1;

import ru.mirea.task5.opt1.Cookware;
import ru.mirea.task5.opt1.Plates;
import ru.mirea.task5.opt1.Spoons;

public class TestTask5 {
    public static void main(String [] args){
        Plates p1 = new Plates(15);
        Spoons s1 = new Spoons(10);
        Cookware c1= new Cookware(20,50);
        System.out.println(p1.ReturnSize());
        System.out.println(s1.ReturnSize());
        System.out.println(c1.ReturnSize());
        c1.UseDishes();
        System.out.println(c1.getClean());

    }
}
