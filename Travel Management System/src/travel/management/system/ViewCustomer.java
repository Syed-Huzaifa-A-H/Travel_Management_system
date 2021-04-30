/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author S_Huzaifa_Ali_H
 */
public class ViewCustomer extends JFrame implements ActionListener {
    
    JButton b2;
    
    public ViewCustomer(String username) {
        setBounds(250, 50, 860, 615);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30, 50, 100, 25);
        add(l1);
        
        JLabel l11 = new JLabel("");//
        l11.setBounds(180, 50, 150, 25);
        add(l11);
        
        JLabel l2 = new JLabel("ID :");
        l2.setBounds(30, 110, 150, 25);
        add(l2);
        
        JLabel l12 = new JLabel("");//---
        l12.setBounds(180, 110, 150, 25);
        add(l12);
        
        JLabel l3 = new JLabel("Number :");
        l3.setBounds(30, 170, 200, 14);
        add(l3);
        
        JLabel l13 = new JLabel("");
        l13.setBounds(180, 170, 150, 25);
        add(l13);
        
        JLabel l4 = new JLabel("Name :");
        l4.setBounds(30, 230, 150, 25);
        add(l4);
        
        JLabel l14 = new JLabel("");
        l14.setBounds(180, 230, 150, 25);
        add(l14);
        
        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(30, 290, 150, 25);
        add(l5);
        
        JLabel l15 = new JLabel("");
        l15.setBounds(180, 290, 150, 25);
        add(l15);
        
        JLabel l6 = new JLabel("Country :");
        l6.setBounds(400, 50, 150, 25);
        add(l6);
        
        JLabel l16 = new JLabel("");
        l16.setBounds(550, 50, 150, 25);
        add(l16);
        
        JLabel l7 = new JLabel("Address :");
        l7.setBounds(400, 110, 150, 25);
        add(l7);
        
        JLabel l17 = new JLabel("");
        l17.setBounds(550, 110, 150, 25);
        add(l17);
        
        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(400, 170, 150, 25);
        add(l8);
        
        JLabel l18 = new JLabel("");
        l18.setBounds(550, 170, 150, 25);
        add(l18);
        
        JLabel l9 = new JLabel("Email :");
        l9.setBounds(400, 230, 150, 25);
        add(l9);
        
        JLabel l19 = new JLabel("");
        l19.setBounds(550, 230, 150, 25);
        add(l19);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(280, 350, 100, 25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0, 400, 600, 200);
        add(l10);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i25 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i36 = new ImageIcon(i25);
        JLabel l20 = new JLabel(i36);
        l20.setBounds(590, 400, 600, 200);
        add(l20);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = 'SHuzaifa'");
            while (rs.next()) {
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
                
            }
        } catch (Exception e) {
            
        }
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new ViewCustomer("").setVisible(true);
        
    }
    
}
