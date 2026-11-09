
package javalab;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class CE10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JList Demo");

        String[] arr = {"Java", "Python", "C", "C++"};

        JList<String> list = new JList<>(arr);
        JLabel msg = new JLabel("Select an item");

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                msg.setText(list.getSelectedValue());
            }
        });

        f.setLayout(new FlowLayout());
        f.add(list);
        f.add(msg);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}