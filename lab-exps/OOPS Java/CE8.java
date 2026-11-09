
package javalab;

import java.io.*;
import java.util.*;

public class CE8 {
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> ht = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("Phone.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\t");
            ht.put(arr[0], arr[1]);
        }

        br.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name or phone number: ");
        String key = sc.nextLine();

        if (ht.containsKey(key)) {
            System.out.println("Phone: " + ht.get(key));
        } else if (ht.containsValue(key)) {
            for (String name : ht.keySet()) {
                if (ht.get(name).equals(key)) {
                    System.out.println("Name: " + name);
                    break;
                }
            }
        } else {
            System.out.println("Record not found");
        }
    }
}