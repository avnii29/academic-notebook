package javalab;

import java.util.Scanner;

class Negative extends Exception {
    Negative(String msg) {
        super(msg);
    }
}

public class SE10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new Negative("Negative number");
            }
            System.out.println("Number is positive");
        } catch (Negative e) {
            System.out.println(e.getMessage());
        }
    }
}