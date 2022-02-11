/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Me - Pranav Sreenath");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Smart Library");
            l3.setForeground(new Color(30, 144, 255));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 250, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Library Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("- v1.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(375, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : S Pranav");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);


            JLabel l7 = new JLabel("Contact Us : sreenathpranav1@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Subscribe on Youtube : Pranav Sreenath ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);
//
//            JLabel l9 = new JLabel("Follow us on Instagram : ");
//            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
//            l9.setBounds(70, 320, 600, 34);
//            contentPane.add(l9);
//
//
//            JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
//            l10.setForeground(new Color(47, 79, 79));
//            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
//            l10.setBounds(70, 400, 600, 34);
//            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}
