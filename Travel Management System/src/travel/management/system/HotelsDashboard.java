/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author S_Huzaifa_Ali_H
 */
public class HotelsDashboard extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5;
    String username;

    public HotelsDashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(100, 20, 1050, 60);
        p1.setBackground(new Color(128, 128, 128));
        add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(180, 100, 900, 500);
        p2.setBackground(new Color(192, 192, 192));
        add(p2);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/Icons/home.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(2000, 1000, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l1 = new JLabel(i3);
//        l1.setBounds(0, 0, 1300, 980);
//        add(l1);
//
//        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
//        Image i9 = i7.getImage().getScaledInstance(2000, 1000, Image.SCALE_DEFAULT);
//        ImageIcon i8 = new ImageIcon(i9);
//        JLabel l5 = new JLabel(i8);
//        l5.setBounds(0, 0, 1300, 980);
//        p2.add(l5);
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

        b1 = new JButton("Delete Packages");
        b1.setBackground(new Color(128, 128, 128));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(Color.white);
        b1.setMargin(new Insets(0, 0, 0, 60));
        b1.setBounds(0, 210, 250, 30);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Make Pakages");
        b2.setBackground(new Color(128, 128, 128));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setMargin(new Insets(0, 0, 0, 60));
        b2.setBounds(0, 180, 250, 30);
        p2.add(b2);
        
        b3 = new JButton("Hotel Details");
        b3.setBackground(new Color(128, 128, 128));
        //b3.setBorder(BorderFactory.createEmptyBorder());
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setForeground(Color.white);
        b3.setMargin(new Insets(0, 0, 0, 30));
        b3.setBounds(0, 120, 250, 30);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Delete Hotel Details");
        b4.setBackground(new Color(128, 128, 128));
//        b4.setBorder(BorderFactory.createEmptyBorder());
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setForeground(Color.white);
        b4.setMargin(new Insets(0, 0, 0, 30));
        b4.setBounds(0, 150, 250, 30);
        p2.add(b4);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            new AddCustomer(username).setVisible(true);

        } else if (ae.getSource() == b2) {
            new Makepakage(username).setVisible(true);

        } else if (ae.getSource() == b3) {

//            new ViewCustomer(username).setVisible(true);
            new HotelDetail(username).setVisible(true);;
        }
    }

    public static void main(String[] args) {
        new HotelsDashboard("").setVisible(true);
    }

}
