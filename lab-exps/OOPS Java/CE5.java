
package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CE5 extends JFrame implements ActionListener {
    JRadioButton red, yellow, green;
    JLabel msg;

    CE5() {
        setTitle("Traffic Light");
        setLayout(new FlowLayout());

        msg = new JLabel("");
        msg.setFont(new Font("Arial", Font.BOLD, 25));
        add(msg);

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        add(red);
        add(yellow);
        add(green);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (red.isSelected()) {
            msg.setText("Stop");
            msg.setForeground(Color.RED);
        } else if (yellow.isSelected()) {
            msg.setText("Ready");
            msg.setForeground(Color.YELLOW);
        } else if (green.isSelected()) {
            msg.setText("Go");
            msg.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new CE5();
    }
}