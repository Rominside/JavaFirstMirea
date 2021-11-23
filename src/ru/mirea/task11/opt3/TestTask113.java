package ru.mirea.task11.opt3;

import com.sun.jdi.event.MethodExitEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTask113 extends JFrame {
    protected JPanel panel = new JPanel();
    public static void main(String [] args){
        new TestTask113();
    }
    private JMenu createMenuColor(JTextArea textArea){
        JMenu menu = new JMenu("color");
        JMenuItem colorRed = new JMenuItem("red");
        JMenuItem colorBlue = new JMenuItem("blue");
        JMenuItem colorGray = new JMenuItem("Gray");
        menu.add(colorRed);
        menu.addSeparator();
        menu.add(colorBlue);
        menu.addSeparator();
        menu.add(colorGray);
        colorBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        colorGray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.GRAY);
            }
        });
        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        return menu;
    }
    private JMenu createMenuText(JTextArea textArea){
        JMenu menu = new JMenu("Text");
        JMenuItem TextTimesNewRoman = new JMenuItem("Times new Roman");
        JMenuItem TextCalibri = new JMenuItem("Calibri");
        JMenuItem TextArial = new JMenuItem("Arial Black");
        menu.add(TextTimesNewRoman);
        menu.addSeparator();
        menu.add(TextCalibri);
        menu.addSeparator();
        menu.add(TextArial);
        TextTimesNewRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times new Roman",Font.PLAIN,14));
            }
        });
        TextArial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Arial Black", Font.PLAIN, 14));
            }
        });
        TextCalibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Calibri", Font.PLAIN, 14));
            }
        });
        return menu;
    }
    public TestTask113(){
        super();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400,500));
        JTextArea textArea = new JTextArea(25,30);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuColor(textArea));
        menuBar.add(createMenuText(textArea));


        panel.add(new JScrollPane(textArea), BorderLayout.WEST);
        panel.add(menuBar, BorderLayout.NORTH);
        this.getContentPane().add(panel);
        this.pack();
    }
}
