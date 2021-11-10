package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTask9 extends JFrame {
    protected int lTeam, rTeam;
    JPanel panel = new JPanel(new BorderLayout());
    JButton leftTeam = new JButton("leftTeam");
    JButton rightTeam = new JButton("rightTeam");
    JLabel result = new JLabel("Result " + this.lTeam + " X " + this.rTeam);
    JLabel lastScore = new JLabel("Last Scorer: N/A");
    Label win = new Label("WINNER:");
    public TestTask9()
    {
        super("Match results");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds( dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        leftTeam.setSize(100,50);
        leftTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lTeam++;
                result.setText("Result " + lTeam + " X " + rTeam);
                lastScore.setText("Last Scorer: lTeam");
                if (lTeam > rTeam){
                    win.setText("lTeam");
                }
            }
        });
        leftTeam.setLocation(0,0);
        rightTeam.setSize(100,50);
        rightTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rTeam++;
                result.setText("Result " + lTeam + " X " + rTeam);
                lastScore.setText("Last Scorer: rTeam");
                if (rTeam > lTeam){
                    win.setText("rTeam");
                }
            }
        });
        rightTeam.setLocation(100,0);

        panel.setVisible(true);
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(500,300));
        this.getContentPane().add(panel);

        result.setLocation(300,0);
        result.setSize(100,50);
        lastScore.setLocation(400,0);
        lastScore.setSize(200,50);
        win.setSize(100,50);

        panel.add(leftTeam);
        panel.add(rightTeam);
        panel.add(result);
        panel.add(lastScore);
        panel.add(win);
        this.pack();
    }

    public static void main(String [] args){
        new TestTask9();
    }
}
