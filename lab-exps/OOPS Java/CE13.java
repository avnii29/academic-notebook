
package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CE13 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Font Size");

        String[] arr = {"10", "20", "30", "40", "50"};
        JComboBox<String> cb = new JComboBox<>(arr);

        JLabel msg = new JLabel("Welcome To OOPs-Lab");

        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt((String) cb.getSelectedItem());
                msg.setFont(new Font("Arial", Font.PLAIN, size));
            }
        });

        f.setLayout(new FlowLayout());
        f.add(cb);
        f.add(msg);

        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}