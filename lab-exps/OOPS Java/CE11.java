
package javalab;

import javax.swing.*;
import java.awt.*;

public class CE11 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tabbed Pane");

        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLUE);

        tab.addTab("Red", p1);
        tab.addTab("Green", p2);
        tab.addTab("Blue", p3);

        f.add(tab);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}