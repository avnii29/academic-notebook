
package javalab;

import java.io.File;
import java.util.Scanner;

public class SE13 {
    static void listFiles(File dir) {
        File[] arr = dir.listFiles();

        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isDirectory()) {
                    listFiles(arr[i]);
                } else {
                    System.out.println(arr[i].getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);
        listFiles(dir);
    }
}