package com.pb.benera.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientInterface extends JFrame implements ActionListener {
    private String serverIp = "127.0.0.1";
    private int serverPort = 1777;
    private final JTextArea textArea = new JTextArea ( );
    private final JTextField name = new JTextField ("ЧАТИК");
    private final JTextField input = new JTextField ( );


    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater (() -> new ClientInterface ( ));

    }


    private ClientInterface() {
        System.out.println ("Соединяемся с сервером " + serverIp + ":" + serverPort);
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        setSize (600, 400);
        setLocationRelativeTo (null);
        setAlwaysOnTop (true);
        textArea.setLineWrap (true);
        add (textArea, BorderLayout.CENTER);
        input.addActionListener (this);
        add (input, BorderLayout.SOUTH);
        add (name, BorderLayout.NORTH);
        name.setForeground (Color.BLACK);
        name.setBackground (Color.GREEN);
        setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        Socket server = null;

        try {
            server = new Socket (serverIp, serverPort);
            BufferedReader inServer = new BufferedReader (new InputStreamReader (server.getInputStream ( )));
            PrintWriter outServer = new PrintWriter (server.getOutputStream ( ), true);
            outServer.flush ( );
            String msg = input.getText ( );
            input.setText (null);
            outServer.println (msg);
            textArea.append ("ALEX:" + msg + "\n");
            textArea.append (inServer.readLine ( ));
            textArea.append ("\n");
            if ("exit".equalsIgnoreCase (msg)) {
                return;
            }


        } catch (IOException e) {
            e.printStackTrace ( );
        }


    }
}
