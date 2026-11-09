
package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CE3 extends JFrame implements ActionListener {
    JTextField num1, num2, result;
    JButton divide;

    CE3() {
        setTitle("Integer Division");
        setLayout(new GridLayout(4, 2, 5, 5));

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        divide = new JButton("Divide");
        divide.addActionListener(this);

        add(new JLabel("Num1:"));
        add(num1);
        add(new JLabel("Num2:"));
        add(num2);
        add(new JLabel("Result:"));
        add(result);
        add(divide);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());

            result.setText(String.valueOf(a / b));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter integers only");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        new CE3();
    }
}