package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TestTask111 extends JFrame {
    protected JPanel panel = new JPanel();
    protected int epsilon = 0;
    protected int number = 0;
    public static void main(String [] args){
        new TestTask111();
    }

    public TestTask111() {
        super("Game");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds( dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        JButton button = new JButton("Enter");
        button.setSize(50,75);
        button.setLocation(0,0);

        number = 0 + (int)(Math.random() * 20);
        System.out.println(number);
        JLabel label = new JLabel("you entered ");

        JTextField textField = new JTextField(5);
        textField.setLocation(0,-200);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(epsilon < 3) {
                    int i = Integer.parseInt(textField.getText().trim());
                    if (i == number) {
                        label.setText("you win");
                        epsilon = 0;
                        number = 0 + (int)(Math.random() * 20);
                        System.out.println(number);
                    } else if (i < number) {
                        label.setText("your number less");
                    } else {
                        label.setText("your number bigger");
                    }
                }
                else {
                    label.setText("Game over");
                }
                epsilon++;
            }
        });

        label.setSize(50,100);
        label.setLocation(100,100);

        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(500,300));
        this.getContentPane().add(panel);
    }
}
