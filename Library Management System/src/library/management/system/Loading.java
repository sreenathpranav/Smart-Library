/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//Java can be multi inheritance with the help of interfaces but cannot be multi-inhertated using classes

public class Loading extends JFrame implements Runnable { //interface Runnable used for multithreading --> extends thread cannot be called because no multi-inheritance possible

    private JPanel contentPane;
    private JProgressBar progressBar;
    Connection conn;
    int s;
    Thread th;  //explicit creation of objects because of implements...

    public static void main(String[] args) {
        new Loading().setVisible(true);
    }

    public void setUploading() {
//        setVisible(false);
        th.start();//if we simply add run()function it will it now work like multi threading so should use th.start() functionality
    }

    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();//100%
                int v = progressBar.getValue();//for getting value 1,2,3,4..... till the Value is Less than 100
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);//setting progress Bar value with (getValue()+1), 1 used for incrementing
                } else {
                    i = 201;//when the loop value turns 201 close the panel and open HOME panel
                    setVisible(false);
                    new Home().setVisible(true);
                }
                Thread.sleep(50);//50millisecond stoping
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading() {
        super("Loading");//first statement inside a constructor for displaying statement as Heading.
        th = new Thread((Runnable) this);//creating thread object explicitly

        setBounds(600, 300, 600, 400);
        contentPane = new JPanel(); //div functionality
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbllibraryManagement = new JLabel("Smart Library v1.0");
        lbllibraryManagement.setForeground(new Color(72, 209, 20));
        lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        lbllibraryManagement.setBounds(130, 135, 300, 25);//custom layout
        contentPane.add(lbllibraryManagement);

//progressBar 
        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130, 135, 300, 25);
        contentPane.add(progressBar);

        JLabel lblNewLabel_2 = new JLabel("Please Wait...");
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblNewLabel_2.setForeground(new Color(160, 82, 45));
        lblNewLabel_2.setBounds(200, 165, 150, 20);
        contentPane.add(lblNewLabel_2);

        setUploading();
    }
}
