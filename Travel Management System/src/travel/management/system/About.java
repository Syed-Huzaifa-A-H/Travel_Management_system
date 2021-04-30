/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author S_Huzaifa_Ali_H
 */
public class About extends JFrame {

    public About() throws HeadlessException {
        setBounds(250, 150, 900, 400);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 60);
        p1.setBackground(new Color(0, 0, 0));
        add(p1);
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(100, 100, 150, 10);
        p2.setBackground(new Color(152, 152, 152));
        p1.add(p2);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(100, 100, 100, 20);
        l2.setFont(new Font("SAN_SERIF ", Font.PLAIN, 20));
        l2.setBackground(Color.red);
        p2.add(l2);

    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
