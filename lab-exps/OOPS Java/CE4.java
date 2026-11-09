
package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CE4 extends JFrame implements ActionListener {
    JTextField result;
    double a, b;
    String op = "";

    CE4() {
        setTitle("Simple Calculator");
        setLayout(new BorderLayout());

        result = new JTextField();
        add(result, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] keys = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "%", "=", "C"
        };

        for (int i = 0; i < keys.length; i++) {
            JButton btn = new JButton(keys[i]);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        try {
            if (s.matches("[0-9]")) {
                result.setText(result.getText() + s);
            } else if (s.equals("C")) {
                result.setText("");
                op = "";
            } else if (s.equals("=")) {
                b = Double.parseDouble(result.getText());

                if (op.equals("+"))
                    result.setText(String.valueOf(a + b));
                else if (op.equals("-"))
                    result.setText(String.valueOf(a - b));
                else if (op.equals("*"))
                    result.setText(String.valueOf(a * b));
                else if (op.equals("%")) {
                    if (b == 0)
                        throw new ArithmeticException();
                    result.setText(String.valueOf(a % b));
                }
            } else {
                a = Double.parseDouble(result.getText());
                op = s;
                result.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a number first");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        new CE4();
    }
}