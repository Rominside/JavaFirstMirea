package ru.mirea.task8.opt3;

import ru.mirea.task8.opt2.TestTask82;

import javax.swing.*;

public class TestTask83 extends JFrame {
    JLabel label = new JLabel("C:\\Users\\OnliF\\Downloads\\gif1.gif");
    ImageIcon icon = new ImageIcon("C:\\Users\\OnliF\\Downloads\\gif1.gif");
    public TestTask83()
    {
        super("Example LayeredTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
        label.setIcon(icon);
        add(label);
    }
    public static void main(String [] args){
        new TestTask83();
    }
}
