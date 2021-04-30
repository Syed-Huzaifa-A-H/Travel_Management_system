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
public class PersonalDetail extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox c1;
    JButton b1, b2;
    JRadioButton r1, r2;

    JTextField t1u, t2u, t3u, t4u, t5u, t6u, t7u, t8u, t9u;
    JComboBox c1u;
    JButton b1u, b2u;
    JRadioButton r1u, r2u;

    PersonalDetail(String username) {
        setUndecorated(true);
        setBounds(250, 150, 800, 550);
        JTabbedPane Pane = new JTabbedPane();
        add(Pane);
        Pane.setBounds(550, 220, 900, 600);

        //ADD USER_DATA
        JPanel p1 = new JPanel();
        JLabel l11 = new JLabel("ADD CUSTOMER DETAILS");
        l11.setBounds(150, 0, 350, 25);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l11);
        p1.setBounds(250, 150, 800, 500);
        p1.setBackground(Color.white);
        p1.setLayout(null);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30, 50, 100, 25);
        p1.add(l1);

        t1 = new JTextField();
        t1.setBounds(220, 50, 150, 25);
        p1.add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setBounds(30, 90, 150, 25);
        p1.add(l2);

        c1 = new JComboBox(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        c1.setBounds(220, 90, 150, 25);
        p1.add(c1);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(30, 130, 200, 14);
        p1.add(l3);

        t2 = new JTextField();
        t2.setBounds(220, 130, 150, 25);
        p1.add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setBounds(30, 170, 150, 25);
        p1.add(l4);

        t3 = new JTextField();
        t3.setBounds(220, 170, 150, 25);
        p1.add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(30, 210, 150, 25);
        p1.add(l5);

        r1 = new JRadioButton("Male");
        r1.setBounds(220, 210, 70, 25);
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        p1.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(300, 210, 75, 25);
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        p1.add(r2);

        JLabel l6 = new JLabel("Country :");
        l6.setBounds(30, 250, 150, 25);
        p1.add(l6);

        t4 = new JTextField();
        t4.setBounds(220, 250, 150, 25);
        p1.add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setBounds(30, 290, 150, 25);
        p1.add(l7);

        t5 = new JTextField();
        t5.setBounds(220, 290, 150, 25);
        p1.add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(30, 330, 150, 25);
        p1.add(l8);

        t6 = new JTextField();
        t6.setBounds(220, 330, 150, 25);
        p1.add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setBounds(30, 370, 150, 25);
        p1.add(l9);

        t7 = new JTextField();
        t7.setBounds(220, 370, 150, 25);
        p1.add(t7);

        b1 = new JButton("ADD");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(70, 430, 100, 25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("CANCEL");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(220, 430, 100, 25);
        b2.addActionListener(this);
        p1.add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400, 40, 450, 400);
        p1.add(l10);
        Pane.addTab("Add Customer Detail", null, p1);
        add(Pane, BorderLayout.CENTER);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + username + "'");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));

            }
        } catch (Exception e) {

        }

        // UPDATE USER_DATA
        JPanel p2 = new JPanel();
        p2.setBounds(250, 150, 800, 550);
        p2.setBackground(Color.white);
        p2.setLayout(null);
        JLabel l11u = new JLabel("UPDATE CUSTOMER DETAILS");
        l11u.setBounds(150, 0, 350, 25);
        l11u.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(l11u);

        JLabel l1u = new JLabel("Username :");
        l1u.setBounds(30, 50, 100, 25);
        p2.add(l1u);

        t1u = new JTextField();
        t1u.setBounds(220, 50, 150, 25);
        p2.add(t1u);

        JLabel l2u = new JLabel("ID :");
        l2u.setBounds(30, 90, 150, 25);
        p2.add(l2u);

        t8u = new JTextField();
        t8u.setBounds(220, 90, 150, 25);
        p2.add(t8u);

        JLabel l3u = new JLabel("Number :");
        l3u.setBounds(30, 130, 200, 14);
        p2.add(l3u);

        t2u = new JTextField();
        t2u.setBounds(220, 130, 150, 25);
        p2.add(t2u);

        JLabel l4u = new JLabel("Name :");
        l4u.setBounds(30, 170, 150, 25);
        p2.add(l4u);

        t3u = new JTextField();
        t3u.setBounds(220, 170, 150, 25);
        p2.add(t3u);

        JLabel l5u = new JLabel("Gender :");
        l5u.setBounds(30, 210, 150, 25);
        p2.add(l5u);

        t9u = new JTextField();
        t9u.setBounds(220, 210, 150, 25);
        p2.add(t9u);

        JLabel l6u = new JLabel("Country :");
        l6u.setBounds(30, 250, 150, 25);
        p2.add(l6u);

        t4u = new JTextField();
        t4u.setBounds(220, 250, 150, 25);
        p2.add(t4u);

        JLabel l7u = new JLabel("Address :");
        l7u.setBounds(30, 290, 150, 25);
        p2.add(l7u);

        t5u = new JTextField();
        t5u.setBounds(220, 290, 150, 25);
        p2.add(t5u);

        JLabel l8u = new JLabel("Phone :");
        l8u.setBounds(30, 330, 150, 25);
        p2.add(l8u);

        t6u = new JTextField();
        t6u.setBounds(220, 330, 150, 25);
        p2.add(t6u);

        JLabel l9u = new JLabel("Email :");
        l9u.setBounds(30, 370, 150, 25);
        p2.add(l9u);

        t7u = new JTextField();
        t7u.setBounds(220, 370, 150, 25);
        p2.add(t7u);

        b1u = new JButton("UPDATE");
        b1u.setBackground(Color.black);
        b1u.setForeground(Color.white);
        b1u.setBounds(70, 430, 100, 25);
        b1u.addActionListener(this);
        p2.add(b1u);

        b2u = new JButton("CANCEL");
        b2u.setBackground(Color.black);
        b2u.setForeground(Color.white);
        b2u.setBounds(220, 430, 100, 25);
        b2u.addActionListener(this);
        p2.add(b2u);

        ImageIcon i1u = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update.png"));
        Image i2u = i1u.getImage().getScaledInstance(450, 400, Image.SCALE_DEFAULT);
        ImageIcon i3u = new ImageIcon(i2u);
        JLabel l10u = new JLabel(i3u);
        l10u.setBounds(400, 20, 450, 500);
        p2.add(l10u);

        Pane.addTab("Update Customer Detail", null, p2);
        add(Pane, BorderLayout.CENTER);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '" + username + "'");
            while (rs.next()) {
                t1u.setText(rs.getString("username"));
                t2u.setText(rs.getString("number"));
                t3u.setText(rs.getString("name"));
                t4u.setText(rs.getString("country"));
                t5u.setText(rs.getString("address"));
                t6u.setText(rs.getString("phone"));
                t7u.setText(rs.getString("email"));
                t8u.setText(rs.getString("id"));
                t9u.setText(rs.getString("gender"));

            }
        } catch (Exception e) {

        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getText();
            String radio = null;
            if (r1.isSelected()) {
                radio = "Male";
            } else if (r2.isSelected()) {
                radio = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            String q = "insert into customer values('" + username + "','" + id + "','" + number + "','" + name + "','" + radio + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2 || ae.getSource() == b2u) {
            this.setVisible(false);

        } else if (ae.getSource() == b1u) {
            String username = t1u.getText();
            String id = t8u.getText();
            String number = t2u.getText();
            String name = t3u.getText();
            String radio = t9u.getText();
            String country = t4u.getText();
            String address = t5u.getText();
            String phone = t6u.getText();
            String email = t7u.getText();
            String q = "update customer set username = '" + username + "',id = '" + id + "',number = '" + number + "',name = '" + name + "',gender = '" + radio + "',country = '" + country + "', address = '" + address + "', phone = '" + phone + "', email = '" + email + "'";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        new PersonalDetail("").setVisible(true);;
    }

}
