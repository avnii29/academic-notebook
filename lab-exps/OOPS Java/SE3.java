
package javalab;

public class SE3 {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + sum(10, 20));
        System.out.println("Sum = " + sum(10, 20, 30));

    }
}