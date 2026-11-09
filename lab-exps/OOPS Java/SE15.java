
package javalab;

import javax.swing.*;

public class SE15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");

        String[] col = {"Roll No", "Name", "Marks"};

        String[][] data = {
            {"101", "Anu", "90"},
            {"102", "Ravi", "85"},
            {"103", "Sita", "95"}
        };

        JTable table = new JTable(data, col);

        frame.add(new JScrollPane(table));
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}