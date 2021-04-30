/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserDashboard extends JFrame implements ActionListener {

    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    String username;

    public UserDashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(100, 20, 1050, 60);
        p1.setBackground(new Color(128, 128, 128));
        add(p1);
        
         JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          setJMenuBar(mb);
          

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(180, 100, 900, 500);
        p2.setBackground(new Color(47, 79, 79));
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/Icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1300, 980);
        add(l1);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i9 = i7.getImage().getScaledInstance(1300, 1000, 10000);
        ImageIcon i8 = new ImageIcon(i9);
        JLabel l5 = new JLabel(i8);
        l5.setBounds(0, 0, 1300, 980);
        p2.add(l5);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/Icons/joker.jpg"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(15, 0, 70, 70);
        p1.add(l2);

        JLabel l3 = new JLabel("Travel And Tour Management System.");
        l3.setFont(new Font("Tahoma", Font.BOLD, 30));
        l3.setForeground(Color.white);
        l3.setBounds(250, 10, 600, 40);
        p1.add(l3);

        JLabel l4 = new JLabel();
        l4.setBounds(0, 0, 0, 0);
        l4.setForeground(Color.yellow);

        l4.setFont(new Font("Tahoma", Font.PLAIN, 50));
//        l1. yaha pr tbdili ki hai
        add(l4);

//        b1 = new JButton("Add Personal Details");
//        b1.setBackground(new Color(0, 0, 102));
//        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        b1.setForeground(Color.white);
//        b1.setMargin(new Insets(0, 0, 0, 60));
//        b1.setBounds(0, 80, 250, 20);
//        b1.addActionListener(this);
//        p2.add(b1);
//
//        b2 = new JButton("Update Personal Details");
//        b2.setBackground(new Color(0, 0, 102));
//        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        b2.setForeground(Color.white);
//        b2.addActionListener(this);
//        b2.setMargin(new Insets(0, 0, 0, 60));
//        b2.setBounds(0, 100, 250, 20);
//        add(b2);
        b3 = new JButton("Personal Details");
        b3.setBackground(new Color(47, 79, 79));
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setForeground(Color.white);
        b3.setMargin(new Insets(0, 0, 0, 30));
        b3.setBounds(0, 120, 250, 20);
        b3.addActionListener(this);
        l5.add(b3);

        b4 = new JButton("Delete Personal Details");
        b4.setBackground(new Color(47, 79, 79));
        b4.setBorder(BorderFactory.createEmptyBorder());
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setForeground(Color.white);
        b4.setMargin(new Insets(0, 0, 0, 30));
        b4.setBounds(0, 140, 250, 20);
        l5.add(b4);

        b5 = new JButton("Check package");
        b5.setBorder(BorderFactory.createEmptyBorder());
        b5.setBackground(new Color(47, 79, 79));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setForeground(Color.white);
        b5.setMargin(new Insets(0, 0, 0, 80));
        b5.setBounds(0, 160, 250, 20);
        l5.add(b5);

        b6 = new JButton("Book Package");
        b6.setBorder(BorderFactory.createEmptyBorder());
        b6.setBackground(new Color(47, 79, 79));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setForeground(Color.white);
        b6.setMargin(new Insets(0, 0, 0, 80));
        b6.setBounds(0, 180, 250, 20);
        l5.add(b6);

        b7 = new JButton("View Package");
        b7.setBorder(BorderFactory.createEmptyBorder());
        b7.setBackground(new Color(47, 79, 79));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setForeground(Color.white);
        b7.setMargin(new Insets(0, 0, 0, 80));
        b7.setBounds(0, 200, 250, 20);
        l5.add(b7);

        b8 = new JButton("View Hotels");
        b8.setBorder(BorderFactory.createEmptyBorder());
        b8.setBackground(new Color(47, 79, 79));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setForeground(Color.white);
        b8.setMargin(new Insets(0, 0, 0, 80));
        b8.setBounds(0, 220, 250, 20);
        l5.add(b8);

        b9 = new JButton("Book Hotel");
        b9.setBorder(BorderFactory.createEmptyBorder());
        b9.setBackground(new Color(47, 79, 79));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setForeground(Color.white);
        b9.setMargin(new Insets(0, 0, 0, 80));
        b9.setBounds(0, 240, 250, 20);
        l5.add(b9);

        b10 = new JButton("View booked Hotel");
        b10.setBorder(BorderFactory.createEmptyBorder());
        b10.setBackground(new Color(47, 79, 79));
        b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b10.setForeground(Color.white);
//        b10.setMargin(new Insets(0, 0, 0, 80));
        b10.setBounds(0, 260, 250, 20);
        l5.add(b10);

        b11 = new JButton("Destination");
        b11.setBorder(BorderFactory.createEmptyBorder());
        b11.setBackground(new Color(47, 79, 79));
        b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b11.setForeground(Color.white);
        b11.setMargin(new Insets(0, 0, 0, 80));
        b11.setBounds(0, 280, 250, 20);
        l5.add(b11);

        b12 = new JButton("Payment");
        b12.setBorder(BorderFactory.createEmptyBorder());
        b12.setBackground(new Color(47, 79, 79));
        b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b12.setForeground(Color.white);
        b12.setMargin(new Insets(0, 0, 0, 80));
        b12.setBounds(0, 300, 250, 20);
        l5.add(b12);

        b13 = new JButton("Calculator");
        b13.setBorder(BorderFactory.createEmptyBorder());
        b13.setBackground(new Color(47, 79, 79));
        b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b13.setForeground(Color.white);
        b13.setMargin(new Insets(0, 0, 0, 80));
        b13.setBounds(0, 320, 250, 20);
        b13.addActionListener(this);
        l5.add(b13);

        b14 = new JButton("Notepad");
        b14.setBorder(BorderFactory.createEmptyBorder());
        b14.setBackground(new Color(47, 79, 79));
        b14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b14.setForeground(Color.white);
        b14.setMargin(new Insets(0, 0, 0, 80));
        b14.setBounds(0, 340, 250, 20);
        b14.addActionListener(this);
        l5.add(b14);

        b15 = new JButton("About");
        b15.setBorder(BorderFactory.createEmptyBorder());
        b15.setBackground(new Color(47, 79, 79));
        b15.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b15.setForeground(Color.white);
        b15.setMargin(new Insets(0, 0, 0, 80));
        b15.setBounds(0, 360, 250, 20);
        l5.add(b15);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            new AddCustomer(username).setVisible(true);

        } else if (ae.getSource() == b13) {
            try {
                Runtime.getRuntime().exec("calc.exe");

            } catch (Exception e) {

            }

        } else if (ae.getSource() == b14) {
            try {
                Runtime.getRuntime().exec("notepad.exe");

            } catch (Exception e) {

            }
        } else if (ae.getSource() == b2) {
            new UpdateCustomer(username).setVisible(true);

        } else if (ae.getSource() == b3) {

//            new ViewCustomer(username).setVisible(true);
            new PersonalDetail(username).setVisible(true);;
        }
    }

    public static void main(String[] args) {
        new UserDashboard("").setVisible(true);
    }

}
