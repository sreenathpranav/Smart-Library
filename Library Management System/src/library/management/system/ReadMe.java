/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.awt.*;
import javax.swing.*;

public class ReadMe extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        new ReadMe().setVisible(true);
    }

    public ReadMe() {
        super("Read Me- Library Management System");
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l3 = new JLabel("Library Management System");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        l3.setBounds(185, 110, 400, 30);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Developed By: Pranav Sreenath");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        l4.setBounds(130, 178, 600, 35);
        contentPane.add(l4);

        JTextArea l7 = new JTextArea("Smart Library is a Library Management System which\n "
                + "    aims in helping Librarian to Manage books of\n\t University Students");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(90, 260, 600, 200);
        contentPane.add(l7);

        contentPane.setBackground(Color.white);
    }
}
