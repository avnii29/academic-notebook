
package javalab;

import java.util.*;

public class CE9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String s = sc.nextLine();

        s = s.replace("=", "");

        ArrayList<Double> num = new ArrayList<>();
        ArrayList<Character> op = new ArrayList<>();

        String n = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                n = n + c;
            } else {
                num.add(Double.parseDouble(n));
                n = "";
                op.add(c);
            }
        }

        num.add(Double.parseDouble(n));

        for (int i = 0; i < op.size(); i++) {
            if (op.get(i) == '*' || op.get(i) == '/') {
                double a = num.get(i);
                double b = num.get(i + 1);
                double res;

                if (op.get(i) == '*')
                    res = a * b;
                else
                    res = a / b;

                num.set(i, res);
                num.remove(i + 1);
                op.remove(i);
                i--;
            }
        }

        double ans = num.get(0);

        for (int i = 0; i < op.size(); i++) {
            if (op.get(i) == '+')
                ans = ans + num.get(i + 1);
            else
                ans = ans - num.get(i + 1);
        }

        System.out.println("Result: " + ans);
    }
}