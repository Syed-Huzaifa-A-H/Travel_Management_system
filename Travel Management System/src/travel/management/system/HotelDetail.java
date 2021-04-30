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
public class HotelDetail extends JFrame implements ActionListener {

    JTextField hotel_name, hotel_phone, hotel_email, manager_name, manager_phone, address;
    JButton b1, b2;
    String name;


    JTextField hotel_name1, hotel_phone1, hotel_email1, manager_name1, manager_phone1, address1;
    JButton b1u, b2u;


    HotelDetail(String username) {
        setUndecorated(true);
        setBounds(250, 150, 800, 550);
        JTabbedPane Pane = new JTabbedPane();
        add(Pane);
        Pane.setBounds(550, 220, 900, 600);

        //ADD hotel_DATA
        JPanel p1 = new JPanel();
        JLabel l11 = new JLabel("ADD HOTEL DETAILS");
        l11.setBounds(150, 0, 350, 25);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l11);
        p1.setBounds(250, 150, 800, 500);
        p1.setBackground(Color.white);
        p1.setLayout(null);

        JLabel l1 = new JLabel("Hotel Name :");
        l1.setBounds(30, 90, 100, 25);
        l1.setForeground(Color.white);
        p1.add(l1);

        hotel_name = new JTextField();
        hotel_name.setBounds(220, 90, 215, 25);
        p1.add(hotel_name);

        JLabel l3 = new JLabel("Hotel PhoneNo. :");
        l3.setForeground(Color.white);
        l3.setBounds(30, 130, 200, 14);
        p1.add(l3);

        hotel_phone = new JTextField();
        hotel_phone.setBounds(220, 130, 215, 25);
        p1.add(hotel_phone);

        JLabel l4 = new JLabel("Manager Name :");
        l4.setBounds(30, 210, 150, 25);
        l4.setForeground(Color.white);
        p1.add(l4);

        manager_name = new JTextField();
        manager_name.setBounds(220, 210, 215, 25);
        p1.add(manager_name);

//        JLabel l5 = new JLabel("Room Type :");
//        l5.setBounds(30, 290, 150, 25);
//        l5.setForeground(Color.white);
//        p1.add(l5);
//        c1 = new JComboBox(new String[]{" - Single room -.",
//            " - Double room. - ",
//            " - Twin rooms. - ",
//            " - Tri rooms. - ",
//            " - Quad rooms. - "});
//        c1.setBounds(220, 290, 215, 25);
//        p1.add(c1);
//        t8 = new JTextField();
//        t8.setBounds(220, 210, 150, 25);
//        p1.add(t8);
//
//        r1 = new JRadioButton("Male");
//        r1.setBounds(220, 210, 70, 25);
//        r1.setFont(new Font("Raleway", Font.BOLD, 14));
//        r1.setBackground(Color.WHITE);
//        p1.add(r1);
//
//        r2 = new JRadioButton("Female");
//        r2.setBounds(300, 210, 75, 25);
//        r2.setFont(new Font("Raleway", Font.BOLD, 14));
//        r2.setBackground(Color.WHITE);
//        p1.add(r2);
//        JLabel l6 = new JLabel("Bed Type :");
//        l6.setBounds(30, 330, 150, 25);
//        p1.add(l6);
//        l6.setForeground(Color.white);
//        
//        c2 = new JComboBox(new String[]{" - 1 single bed. - ",
//            " - 1 double bed. - ",
//            " - 2 single beds. - ",
//            " - 1 double and 1 single bed. - ",
//            " - 1 double and 2 single. - "});
//        c2.setBounds(220, 330, 215, 25);
//        p1.add(c2);
        JLabel l7 = new JLabel("Address :");
        l7.setBounds(30, 290, 150, 25);
        l7.setForeground(Color.white);
        p1.add(l7);

        address = new JTextField();
        address.setBounds(220, 290, 215, 25);
        p1.add(address);

        JLabel l8 = new JLabel("Manager PhoneNo.:");
        l8.setBounds(30, 250, 150, 25);
        l8.setForeground(Color.white);
        p1.add(l8);

        manager_phone = new JTextField();
        manager_phone.setBounds(220, 250, 215, 25);
        p1.add(manager_phone);

        JLabel l9 = new JLabel("Hotel Email :");
        l9.setBounds(30, 170, 150, 25);
        l9.setForeground(Color.white);
        p1.add(l9);

        hotel_email = new JTextField();
        hotel_email.setBounds(220, 170, 215, 25);
        p1.add(hotel_email);

        b1 = new JButton("ADD");
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.setBounds(70, 430, 100, 25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("CANCEL");
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        b2.setBounds(220, 430, 100, 25);
        b2.addActionListener(this);
        p1.add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0, 0, 800, 550);
        p1.add(l10);
        Pane.addTab("Add Hotel Detail", null, p1);
        add(Pane, BorderLayout.CENTER);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + username + "'");
            while (rs.next()) {
//                t1.setText(rs.getString("username"));
                  manager_name.setText(rs.getString("name"));
                  name = rs.getString("name");

            }
        } catch (Exception e) {

        }

        // UPDATE USER_DATA
        JPanel p2 = new JPanel();
        p2.setBounds(250, 150, 800, 550);
        p2.setBackground(Color.white);
        p2.setLayout(null);
        JLabel l11u = new JLabel("UPDATE Hotel DETAILS");
        l11u.setBounds(150, 0, 350, 25);
        l11u.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(l11u);

        JLabel l1u = new JLabel("Hotel Name :");
        l1u.setBounds(30, 50, 100, 25);
        p2.add(l1u);

        hotel_name1 = new JTextField();
        hotel_name1.setBounds(220, 50, 150, 25);
        p2.add(hotel_name1);

        JLabel l2u = new JLabel("Hotel PhoneNo. :");
        l2u.setBounds(30, 90, 150, 25);
        p2.add(l2u);

        hotel_phone1 = new JTextField();
        hotel_phone1.setBounds(220, 90, 150, 25);
        p2.add(hotel_phone1);

        JLabel l3u = new JLabel("Hotel Email :");
        l3u.setBounds(30, 130, 200, 14);
        p2.add(l3u);

        hotel_email1 = new JTextField();
        hotel_email1.setBounds(220, 130, 150, 25);
        p2.add(hotel_email1);

        JLabel l4u = new JLabel("Manager Name:");
        l4u.setBounds(30, 170, 150, 25);
        p2.add(l4u);

        manager_name1 = new JTextField();
        manager_name1.setBounds(220, 170, 150, 25);
        p2.add(manager_name1);

        JLabel l5u = new JLabel("Manager PhoneNo. :");
        l5u.setBounds(30, 210, 150, 25);
        p2.add(l5u);

        manager_phone1= new JTextField();
        manager_phone1.setBounds(220, 210, 150, 25);
        p2.add(manager_phone1);

        JLabel l6u = new JLabel("Address :");
        l6u.setBounds(30, 250, 150, 25);
        p2.add(l6u);

        address1 = new JTextField();
        address1.setBounds(220, 250, 150, 25);
        p2.add(address1);

//        JLabel l7u = new JLabel("Address :");
//        l7u.setBounds(30, 290, 150, 25);
//        p2.add(l7u);
//
//        manager_phone1 = new JTextField();
//        manager_phone1.setBounds(220, 290, 150, 25);
//        p2.add(manager_phone1);
//        JLabel l8u = new JLabel("Phone :");
//        l8u.setBounds(30, 330, 150, 25);
//        p2.add(l8u);
//
//        address1 = new JTextField();
//        address1.setBounds(220, 330, 150, 25);
//        p2.add(address1);
//
//        JLabel l9u = new JLabel("Email :");
//        l9u.setBounds(30, 370, 150, 25);
//        p2.add(l9u);
//
//        t7u = new JTextField();
//        t7u.setBounds(220, 370, 150, 25);
//        p2.add(t7u);
        b1u = new JButton("UPDATE");
        b1u.setBackground(Color.blue);
        b1u.setForeground(Color.white);
        b1u.setBounds(70, 430, 100, 25);
        b1u.addActionListener(this);
        p2.add(b1u);

        b2u = new JButton("CANCEL");
        b2u.setBackground(Color.blue);
        b2u.setForeground(Color.white);
        b2u.setBounds(220, 430, 100, 25);
        b2u.addActionListener(this);
        p2.add(b2u);

        ImageIcon i1u = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest8.jpg"));
        Image i2u = i1u.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3u = new ImageIcon(i2u);
        JLabel l10u = new JLabel(i3u);
        l10u.setBounds(0, 0, 800, 550);
        p2.add(l10u);

        Pane.addTab("Update Customer Detail", null, p2);
        add(Pane, BorderLayout.CENTER);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotelier where manager_name = '" + name + "'");
            while (rs.next()) {
                hotel_name1.setText(rs.getString("hotel_name"));
                hotel_phone1.setText(rs.getString("hotel_phone"));
                hotel_email1.setText(rs.getString("hotel_email"));
                manager_name1.setText(rs.getString("manager_name"));
                manager_phone1.setText(rs.getString("manager_phone"));
                address1.setText(rs.getString("address"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String hotelName = hotel_name.getText();
            String hotelPhone = hotel_phone.getText();
            String hotelEmail = hotel_email.getText();
            String managerName = manager_name.getText();
            String managerPhone = manager_phone.getText();
            String addres = address.getText();
//            String address = t5.getText();
//            String phone = t6.getText();
//            String email = t7.getText();
            String q = "insert into hotelier values('" + hotelName + "','" + hotelPhone+ "','" + hotelEmail + "','" + managerName+ "','" + managerPhone+ "','" + addres + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Hotel and Hotelier Details Added Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2 || ae.getSource() == b2u) {
            this.setVisible(false);

        } else if (ae.getSource() == b1u) {
            String hotelName1 = hotel_name1.getText();
            String hotelPhone1 = hotel_phone1.getText();
            String hotelEmail1 = hotel_email1.getText();
            String managerName1 = manager_name1.getText();
            String managerPhone1 = manager_phone1.getText();
            String addres1 = address1.getText();
//            String address = t5.getText();
//            String phone = t6.getText();
//            String email = t7.getText();
            String q = "insert into hotelier values('" + hotelName1 + "','" + hotelPhone1+ "','" + hotelEmail1 + "','" + managerName1+ "','" + managerPhone1 + "','" + addres1 + "')";
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
        new HotelDetail("").setVisible(true);;
    }

}
