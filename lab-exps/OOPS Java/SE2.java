
package javalab;

import java.util.Scanner;

public class SE2 {
    static int fib(int num) {
        if (num <= 1)
            return num;

        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");
    }
}