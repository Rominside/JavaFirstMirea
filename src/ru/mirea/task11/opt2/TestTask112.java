package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;

public class TestTask112 extends JFrame {
    protected JPanel panel = new JPanel();
    public static void main(String [] args){
        new TestTask112();
    }
    public TestTask112(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);

        JButton button1 = new JButton("WEST");
        JButton button2 = new JButton("EAST");
        JButton button3 = new JButton("NORTH");
        JButton button4 = new JButton("SOUTH");
        JButton button5 = new JButton("CENTER");

        panel.setLayout(new BorderLayout());
        panel.add(button1, BorderLayout.WEST);
        button1.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"you in WEST");
            dialog.setBounds(400,300,200,100);
            dialog.setVisible(true);
        });
        panel.add(button2, BorderLayout.EAST);
        button2.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"you in EAST");
            dialog.setBounds(400,300,200,100);
            dialog.setVisible(true);
        });
        panel.add(button3, BorderLayout.NORTH);
        button3.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"you in NORTH");
            dialog.setBounds(400,300,200,100);
            dialog.setVisible(true);
        });
        panel.add(button4, BorderLayout.SOUTH);
        button4.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"you in SOUTH");
            dialog.setBounds(400,300,200,100);
            dialog.setVisible(true);
        });
        panel.add(button5, BorderLayout.CENTER);
        button5.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"you in CENTER");
            dialog.setBounds(400,300,200,100);
            dialog.setVisible(true);
        });


        this.setPreferredSize(new Dimension(600,400));
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
