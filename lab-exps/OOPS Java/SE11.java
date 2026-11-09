
package javalab;

import java.awt.*;
import java.awt.event.*;

public class SE11 extends Frame {
    String msg = "";

    SE11() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                msg = "Mouse Clicked";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                msg = "Mouse Pressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                msg = "Mouse Released";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                msg = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                msg = "Mouse Exited";
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                msg = "Mouse Moved";
                repaint();
            }

            public void mouseDragged(MouseEvent e) {
                msg = "Mouse Dragged";
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 150, 150);
    }

    public static void main(String[] args) {
        new SE11();
    }
}