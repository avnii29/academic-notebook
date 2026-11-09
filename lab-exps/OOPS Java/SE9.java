
package javalab;

import java.util.Scanner;

class Odd extends Thread {
    int n;

    Odd(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Even extends Thread {
    int n;

    Even(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class SE9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Odd odd = new Odd(n);
        Even even = new Even(n);

        odd.start();
        even.start();
    }
}