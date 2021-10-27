package ru.mirea.task8.opt2;

import javax.swing.*;

public class TestTask82 extends JFrame {
    public TestTask82(String title)
    {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
        JLabel label = new JLabel(title);
        ImageIcon icon = new ImageIcon(title);
        label.setIcon(icon);
        add(label);
    }
    public static void main(String [] args){
        new TestTask82(args[0]);
    }
}
