package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    protected int r, a, b, x, y;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void PaintShape(Graphics grf);
}
