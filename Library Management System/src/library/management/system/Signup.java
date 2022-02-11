/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;  //called for border setting

public class Signup extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;

//creating main()
    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

//creating constructor
    public Signup() {
//JPanel
        setBounds(600, 250, 606, 406);
        contentPane = new JPanel();//new JPanel
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

//JLabel- Username, Name, Password,Answer
        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setForeground(Color.DARK_GRAY);
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setBounds(99, 86, 92, 26);
        contentPane.add(lblUsername);

        JLabel lblName = new JLabel("Name :");
        lblName.setForeground(Color.DARK_GRAY);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblName.setBounds(99, 123, 92, 26);
        contentPane.add(lblName);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setForeground(Color.DARK_GRAY);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(99, 160, 92, 26);
        contentPane.add(lblPassword);

        JLabel lblAnswer = new JLabel("Answer :");
        lblAnswer.setForeground(Color.DARK_GRAY);
        lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAnswer.setBounds(99, 234, 92, 26);
        contentPane.add(lblAnswer);

//adding ComboBox
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Your NickName?", "Your Lucky Number?", "Your child SuperHero?", "Your childhood Name?"}));//for inputing values in comboBox
        comboBox.setBounds(265, 202, 140, 20);
        contentPane.add(comboBox);

//JLabel- SecurityQuestion
        JLabel lblSecurityQuestion = new JLabel("Security Question :");
        lblSecurityQuestion.setForeground(Color.DARK_GRAY);
        lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAnswer.setBounds(99, 197, 140, 26);
        contentPane.add(lblSecurityQuestion);

//textField
        textField = new JTextField();
        textField.setBounds(265, 91, 148, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(265, 128, 148, 20);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(265, 165, 148, 20);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(265, 239, 148, 20);
        contentPane.add(textField_3);

//buttons
        b1 = new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 13));
        b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.setBounds(300, 289, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);//new Color is not neaded
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(34, 139, 34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",  // we can also use setBorder instead of new Border to set Boder functionality
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setBounds(31, 46, 476, 296);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn(); //conn object used whenever data/sql is involved.

            if (ae.getSource() == b1) {
                String sql = "insert into account(username,name,password,sec_q,sec_ans)values(?,?,?,?,?)"; //Inserting data in SQL
                PreparedStatement st = con.c.prepareStatement(sql);

//setString is found inside PreparedStatment
                st.setString(1, textField.getText());  //setText for explicitly setting function and getText to get the text value
                st.setString(2, textField_1.getText());
                st.setString(3, textField_2.getText());
                st.setString(4, (String) comboBox.getSelectedItem());
                st.setString(5, textField_3.getText());

                int i = st.executeUpdate();  //executeQuery->for mainly creation    and executeUpdate -> to udate Query value
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "successfully created");//popup
                }

//for removing "" or setting all text value dynamically
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
            }

            if (ae.getSource() == b2) {
                this.setVisible(false);
                new Login_user().setVisible(true);
            }

        } catch (Exception e) {

        }

    }

}
