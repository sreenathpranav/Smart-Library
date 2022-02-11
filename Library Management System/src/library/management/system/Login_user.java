/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener {  //JFrame mainly used in swing for creating frame

//creating Attributes
    private JPanel panel;  //HTML div tab functionality
    private JTextField textField;   //for inputing text box in field
    private JPasswordField passwordField;
    private JButton b1, b2, b3;

//creating method
    public Login_user() {

//        setLayout(null);//for making custom layouts
        setBackground(new Color(169, 169, 169));//function is in JFrame
        setBounds(600, 300, 600, 400); // frame size(x-axis,y-axis,length,breadth)

        panel = new JPanel();  //making object from panel attribute
        panel.setBackground(new Color(176, 224, 230)); // for setting bg color
        setContentPane(panel);
        panel.setLayout(null); //for using custom layout

//settings USERNAME: and PASSWORD:
        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(124, 89, 95, 24);
        panel.add(l1);

        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(124, 124, 95, 24);
        panel.add(l2);

//setting INPUT username and passowrd variables
        textField = new JTextField();
        textField.setBounds(210, 93, 157, 20);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(210, 128, 157, 20);
        panel.add(passwordField);

//setting BUTTONS b1,b2,b3
//b1
        b1 = new JButton("Login");
        b1.addActionListener(this);  //for activating buttons through ActionListener functions

        b1.setForeground(new Color(46, 139, 87)); //setting foreground color
        b1.setBackground(new Color(250, 250, 210)); //setting background color
        b1.setBounds(149, 181, 113, 39); //setting frame size
        panel.add(b1); // adding button in div or panel
//b2
        b2 = new JButton("SignUp");
        b2.addActionListener(this);

        b2.setForeground(new Color(139, 69, 19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(289, 181, 113, 39);
        panel.add(b2);
//b3
        b3 = new JButton("Forget Password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(199, 231, 179, 39);
        panel.add(b3);

//trouble in login
        JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setForeground(new Color(255, 0, 0));
        l5.setBounds(70, 240, 130, 20);
        panel.add(l5);

    }

    public void actionPerformed(ActionEvent ae) { //for activating buttons through actionPerformed method is found in ActionListener interface
//ActionEvent helps in understanding which button is clicked

        if (ae.getSource() == b1) {  //if button1 is clicked
            Boolean status = false;
            try {
                conn con = new conn();   //for connecting to sql to check if username and password is true
                String sql = "select * from account where username=? and password=?";   //sql query in String and ? because of parameterised string
                PreparedStatement st = con.c.prepareStatement(sql); // c is the Connection from con class

                st.setString(1, textField.getText());  //retreiving the text value of inputted username -> getText()
                st.setString(2, passwordField.getText()); //Changing the value of ? in String sql -> setString()

                //executeQuery must be used whenever SELECT statement is present in SQL...
                ResultSet rs = st.executeQuery(); //executing the sql statement and returning value is rs
                if (rs.next()) {                  //row to row jumb in sql checking values in database
                    this.setVisible(false);       //so that if true then current class closes and opens a new window LOADING.....
                    new Loading().setVisible(true); //opens into Constructor Loading Frame...so [write code in constructor and not functions]
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login!"); //pop-up throwing message INVALID(message/error,display message)
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (ae.getSource() == b2) {
//          this.setVisible(false);  same as below
            setVisible(false);
//            Signup su = new Signup();
//            su.setVisible(true);
            new Signup().setVisible(true);
        }
        if (ae.getSource() == b3) {
            setVisible(false);
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login_user().setVisible(true);
    }
}
