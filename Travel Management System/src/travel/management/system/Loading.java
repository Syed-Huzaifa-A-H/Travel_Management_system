package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

    JProgressBar p;
    Connection conn;
    String username;

    Thread t;

    public void setUploading() {
        setVisible(false);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                int m = p.getMaximum();
                int v = p.getValue();
                if (v < m) {
                    p.setValue(p.getValue() + 1);
                } else {
                    i = 201;
                    setVisible(false);
                    new UserDashboard(username).setVisible(true);

                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading(String user) {
        this.username = user;
        t = new Thread((Runnable) this);

        setBounds(300, 150, 600, 400);
        setBackground(new Color(51, 204, 255));
        setLayout(null);

        JLabel l1 = new JLabel("Travel and Tourism Application");
        l1.setForeground(new Color(72, 209, 204));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        l1.setBounds(50, 46, 700, 35);
        add(l1);

        p = new JProgressBar();
        p.setFont(new Font("Tahoma", Font.BOLD, 12));
        p.setStringPainted(true);
        p.setBounds(130, 135, 300, 25);
        add(p);

        JLabel l2 = new JLabel("Please Wait....");
        l2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        l2.setForeground(new Color(160, 82, 45));
        l2.setBounds(200, 165, 150, 20);
        add(l2);

        JLabel l3 = new JLabel("Welcome " + username);
        l3.setBounds(30, 315, 400, 25);
        l3.setFont(new Font("Tahoma ", Font.BOLD, 16));
        l3.setForeground(Color.red);
        add(l3);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 10, 580, 380);
        add(panel);

        setUndecorated(true);
        setUploading();
    }

    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }
}
