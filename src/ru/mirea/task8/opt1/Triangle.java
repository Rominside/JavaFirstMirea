package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;
import org.w3c.dom.css.RGBColor;

public class Triangle extends Shape{
    public Triangle(int x, int y){
        super(x, y);
    }

    @Override
    public void PaintShape(Graphics grf) {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        grf.setColor(new Color(r,g,b));
        int width = rand.nextInt(100);
        int length = rand.nextInt(100);
        grf.drawLine(x, y, x + length/2,y + width);
        grf.drawLine(x, y, x + length/2, y);
        grf.drawLine(x + length/2, y + width, x + length/2, y);
    }
}
