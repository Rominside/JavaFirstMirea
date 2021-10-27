package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TaskTest81 extends JFrame {
    public TaskTest81()
    {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
    }
    public void paint(Graphics grf)
    {
        setBackground(Color.white);
        JLayeredPane lp = getLayeredPane();
        for (int i = 0; i < 20; i++)
        {
            int x = 100+(int)(Math.random()*400);
            int y = 100+(int)(Math.random()*400);
            int shape = (int)(Math.random()*3);
            Shape shp;
            switch (shape){
                case 1:
                    shp = new Triangle(x,y);
                    break;
                case 2:
                    shp = new Rectangle(x,y);
                    break;
                default:
                    shp = new Circle(x,y);
                    break;
            };
            shp.PaintShape(grf);
        }
    }
    public static void main(String [] args){
        new TaskTest81();
    }
}
