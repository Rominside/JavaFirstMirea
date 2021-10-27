package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;
import org.w3c.dom.css.RGBColor;

public class Circle extends Shape{
    public Circle(int x, int y){
        super(x, y);
    }

    @Override
    public void PaintShape(Graphics grf) {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        grf.setColor(new Color(r,g,b));
        this.r = rand.nextInt(100);
        grf.drawOval(x, y ,this.r, this.r);
    }
}
