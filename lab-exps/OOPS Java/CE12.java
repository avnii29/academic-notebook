
package javalab;

import javax.swing.*;
import java.awt.event.*;

public class CE12 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Popup Menu");
        JTextArea area = new JTextArea(10, 25);

        JPopupMenu menu = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));

        cut.addActionListener(e -> area.cut());
        copy.addActionListener(e -> area.copy());
        paste.addActionListener(e -> area.paste());

        menu.add(cut);
        menu.add(copy);
        menu.add(paste);

        area.setComponentPopupMenu(menu);

        f.add(new JScrollPane(area));
        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}