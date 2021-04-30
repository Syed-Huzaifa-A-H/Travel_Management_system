package travel.management.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Makepakage extends JFrame implements ActionListener {

    JLabel l11, l15, l16;
    String email, managerName;
    JTextField hotel_name, cost_per_day, ac_charge, food_per_day;
    JButton b1, b2;

    public Makepakage(String username) {
        this.email = username;
        setBounds(250, 150, 800, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel l = new JLabel("UPDATE CUSTOMER DETAILS");
        l.setBounds(150, 0, 350, 25);
        l.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l);

        JLabel l1 = new JLabel("Hotel Name :");
        l1.setBounds(30, 100, 100, 25);
        add(l1);

        l11 = new JLabel("");
        l11.setBounds(220, 100, 100, 25);
        add(l11);

        JLabel l5 = new JLabel("Hotel Email :");
        l5.setBounds(30, 150, 100, 25);
        add(l5);

        l15 = new JLabel("");
        l15.setBounds(220, 150, 100, 25);
        add(l15);

        JLabel l6 = new JLabel("Hotel Name :");
        l6.setBounds(30, 200, 100, 25);
        add(l6);

        l16 = new JLabel("");
        l16.setBounds(220, 200, 100, 25);
        add(l16);

        JLabel l2 = new JLabel("Cost Per Day :");
        l2.setBounds(30, 250, 200, 14);
        add(l2);

        cost_per_day = new JTextField();
        cost_per_day.setBounds(220, 250, 150, 25);
        add(cost_per_day);

        JLabel l3 = new JLabel("Ac Charges :");
        l3.setBounds(30, 300, 150, 25);
        add(l3);

        ac_charge = new JTextField();
        ac_charge.setBounds(220, 300, 150, 25);
        add(ac_charge);

        JLabel l4 = new JLabel("Food Per Day :");
        l4.setBounds(30, 350, 150, 25);
        add(l4);

        food_per_day = new JTextField();
        food_per_day.setBounds(220, 350, 150, 25);
        add(food_per_day);

        b1 = new JButton("MAKE");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(70, 430, 100, 25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(220, 430, 100, 25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400, 20, 450, 500);
        add(l10);
        System.out.println(username);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + email + "'");
            while (rs.next()) {

                managerName = rs.getString("name");

            }
        } catch (Exception e) {

        }
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from package where hotel_email = '" + email + "'");
            while (rs.next()) {

                cost_per_day.setText(rs.getString("cost_per_day"));
                ac_charge.setText(rs.getString("ac_charge"));
                food_per_day.setText(rs.getString("food_per_day"));

            }
        } catch (Exception e) {

        }

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotelier where manager_name = '"+ managerName + "'" );
            while (rs.next()) {
                l16.setText(rs.getString("address"));
                l15.setText(rs.getString("hotel_phone"));
                l11.setText(rs.getString("hotel_name"));

            }
        } catch (Exception e) {

        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String cpd = cost_per_day.getText();
            String ac = ac_charge.getText();
            String fpd = food_per_day.getText();
            String hotelName = l11.getText();
            String address = l16.getText();
            String hotelPhone = l15.getText();

            String q = "insert into package values( '"+hotelName+"','" + cpd + "','" + ac + "','" + fpd + "','" + email + "','" + address + "','" + hotelPhone + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Pakage Created Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Makepakage("").setVisible(true);

    }

}
