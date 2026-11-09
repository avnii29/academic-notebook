
package javalab;

import javax.swing.*;
import javax.swing.tree.*;

public class SE14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");

        DefaultMutableTreeNode root =
            new DefaultMutableTreeNode("College");

        DefaultMutableTreeNode cse =
            new DefaultMutableTreeNode("CSE");

        DefaultMutableTreeNode ece =
            new DefaultMutableTreeNode("ECE");

        root.add(cse);
        root.add(ece);

        cse.add(new DefaultMutableTreeNode("Java"));
        cse.add(new DefaultMutableTreeNode("Python"));
        ece.add(new DefaultMutableTreeNode("Circuits"));

        JTree tree = new JTree(root);

        frame.add(new JScrollPane(tree));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}