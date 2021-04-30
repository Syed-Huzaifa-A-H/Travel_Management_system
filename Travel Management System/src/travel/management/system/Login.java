package travel.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField p1;
    JButton b1, b2, b3;

    Login() {

        setUndecorated(false);
//        setSize(400, 400);
//        setLocation(400, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(250, 150, 900, 400);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(51, 204, 255));
        p1.setLayout(null);
        p1.setBounds(0, 0, 450, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/Icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(120, 80, 200, 200);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(450, 0, 900, 400);
        add(p2);

        JLabel t = new JLabel("USER LOGIN");
        t.setBounds(50, 10, 1000, 40);
        t.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 37));
        p2.add(t);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(50, 80, 100, 20);
        l2.setFont(new Font("SAN_SERIF ", Font.PLAIN, 20));
        p2.add(l2);
//        l2.setVisible(true);
        t1 = new JTextField();
        t1.setBounds(50, 100, 300, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setBorder(new LineBorder(new Color(0, 0, 0)));
        p2.add(t1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(50, 150, 90, 20);
        l3.setFont(new Font("CALIBRI ", Font.PLAIN, 20));
        p2.add(l3);
        l3.setVisible(true);

        
        b1 = new JButton("Login");
        b1.setBounds(50, 220, 140, 25);
       // b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBorder(new LineBorder(Color.white));
        b1.setForeground(Color.white);
        b1.setBackground(new Color(51, 204, 255));
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Signup");
        b2.setBounds(210, 220, 140, 25);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setForeground(Color.white);
        b2.setBackground(new Color(51, 204, 255));
        b2.setBorder(new LineBorder(Color.white));
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Forget Password");
        b3.setBounds(120, 270, 170, 25);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.setForeground(new Color(52, 204, 255));
        b3.setBackground(Color.white);
        b3.setBorder(new LineBorder(new Color(51, 204, 255)));
        b3.addActionListener(this);
        p2.add(b3);

        JLabel l4 = new JLabel("Trouble in Login...");
        l4.setBounds(300, 275, 100, 20);
        l4.setForeground(Color.red);
        p2.add(l4);
        
        this.p1 = new JPasswordField();
        this.p1.setBounds(50, 170, 300, 25);
        this.p1.setBorder(BorderFactory.createEmptyBorder());
        this.p1.setBorder(new LineBorder(new Color(0,0,0)));
        p2.add(this.p1);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                String username = t1.getText();
                String password = String.valueOf(p1.getPassword());
                String sql = "select * from account where username = '" + username + "' AND password = '" + password + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(sql);
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading(username).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "invalid Login");
                }
            } catch (Exception e) {

            }
        } else if (ae.getSource() == b2) {
            new Signup().setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
