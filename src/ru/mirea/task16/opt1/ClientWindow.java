package ru.mirea.task16.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientWindow extends JFrame implements ActionListener, TCPConnectionListener {
    private static final String IP_ADDR = "192.168.137.133";
    private static final int PORT = 8189;
    private static int WIDTH = 600;
    private static int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientWindow();
            }
        });
    }

    private static final Insets insets = new Insets(0, 0, 0, 0);
    private final JTextArea log = new JTextArea();
    private final JTextField fieldNickName = new JTextField("Roma");
    private final JTextField fieldStatus = new JTextField("My status");
    private final JTextField fieldInput = new JTextField();
    private  TCPConnection connection;

    public void UserNameExceptions () throws ClientExceptions{
        if (fieldNickName.getText() == "fuck") throw new ClientExceptions("un correct user name", fieldNickName.getText());
    }

    public void InputUsername(){
        try {
            UserNameExceptions();
        }catch (ClientExceptions e){
            System.out.println(e.msg);
            System.out.println(e.UserName);
        }
    }

    public ClientWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH, HEIGHT);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        log.setEditable(true);
        log.setLineWrap(true);
        fieldInput.addActionListener(this);
        addComponent(this, fieldNickName, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        addComponent(this, fieldStatus, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        addComponent(this, log, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        addComponent(this, fieldInput, 0, 2, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        try {
            UserNameExceptions();
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            PrintMessage("Connection exception, unable to create connection : " + e);
        } catch (ClientExceptions e){
            System.out.println(e.msg);
            System.out.println(e.UserName);
        }
    }

    private static void addComponent(Container container, Component component, int gridx, int gridy,
                                     int gridwidth, int gridheight, int anchor, int fill) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
                anchor, fill, insets, 0, 0);
        container.add(component, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = fieldInput.getText();
        if(message.equals("")){
            return;
        }
        fieldInput.setText(null);
        connection.sendString(" " + fieldNickName.getText() + ": " + message);
    }


    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        PrintMessage("Connection ready...");
    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {
        PrintMessage(value);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        PrintMessage("Connection close");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        PrintMessage("Connection exception: " + e);
    }

    private String  Date(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd Время: HH:mm");
        return formatter.format(date);
    }

    private synchronized void PrintMessage(String msg){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String DateMsg = Date();
                log.append(DateMsg + msg + "\n");
                log.setCaretPosition(log.getDocument().getLength());
            }
        });
    }
}
