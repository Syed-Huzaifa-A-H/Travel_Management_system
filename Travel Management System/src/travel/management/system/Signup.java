package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    Choice c1;

    Signup() {
        setUndecorated(true);
        setBounds(250, 150, 900, 360);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(50, 20, 125, 25);
        p1.add(l1);

        t1 = new JTextField();
        t1.setBounds(190, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);

        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(50, 60, 125, 25);
        p1.add(l2);

        t2 = new JTextField();
        t2.setBounds(190, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);

        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(50, 100, 125, 25);
        p1.add(l3);

        t3 = new JTextField();
        t3.setBounds(190, 100, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);

        JLabel l4 = new JLabel("Security Question");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(50, 140, 125, 25);
        p1.add(l4);

        c1 = new Choice();
        c1.add("Aam or Amir Liaquat?");
        c1.add("Captain America or Iron Man?");
        c1.add("Munna Bhaiya or Kaleen Bhaiya?");
        c1.add("Childhood Crush?");
        c1.add("Morning or Evening?");
        c1.setBounds(190, 140, 200, 25);
        p1.add(c1);

        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(50, 180, 100, 25);
        p1.add(l5);

        t4 = new JTextField();
        t4.setBounds(190, 180, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/joker.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(550, 20, 250, 250);
        add(l6);

        b1 = new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(new Color(133, 193, 233));
        b1.setBackground(Color.white);
        b1.setBounds(80, 250, 100, 30);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setForeground(new Color(133, 193, 233));
        b2.setBackground(Color.white);
        b2.setBounds(250, 250, 100, 30);
        p1.add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();
           
                    String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"','User')";
               try{
                   Conn c = new Conn();
                   c.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null,"Account Create Successfully.","ALERT!",JOptionPane.WARNING_MESSAGE);
                   this.setVisible(false);
                   new Login().setVisible(true);
               }catch(Exception e){
                   e.printStackTrace();
                   
               }
            
            
            
            
            
        } else if (ae.getSource() == b2) {
            new Login().setVisible(true);
            this.setVisible(false);
        } 
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

}
