
package javalab;

import java.util.ArrayList;

public class SE16 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Java");
        arr.add("Python");
        arr.add("C");

        System.out.println("ArrayList: " + arr);

        arr.add("HTML");
        System.out.println("After adding: " + arr);

        arr.remove("C");
        System.out.println("After removing: " + arr);

        System.out.println("Element at index 0: " + arr.get(0));
        System.out.println("Size: " + arr.size());
        System.out.println("Contains Java: " + arr.contains("Java"));

        arr.set(0, "C++");
        System.out.println("After updating: " + arr);

        arr.clear();
        System.out.println("After clearing: " + arr);
    }
}