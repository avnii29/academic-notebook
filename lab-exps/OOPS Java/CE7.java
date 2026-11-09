
package javalab;

import java.awt.*;
import java.io.*;

public class CE7 {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame("Table");
        f.setLayout(new GridLayout(0, 3, 5, 5));

        BufferedReader br = new BufferedReader(new FileReader("Table.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");

            for (int i = 0; i < arr.length; i++) {
                f.add(new Label(arr[i]));
            }
        }

        br.close();

        f.setSize(400, 200);
        f.setVisible(true);

        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                f.dispose();
            }
        });
    }
}