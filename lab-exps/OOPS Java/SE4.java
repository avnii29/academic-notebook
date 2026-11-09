
package javalab;

public class SE4 {

    SE4() {
        System.out.println("Default constructor");
    }

    SE4(int num) {
        System.out.println("Number = " + num);
    }

    SE4(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        SE4 obj1 = new SE4();
        SE4 obj2 = new SE4(10);
        SE4 obj3 = new SE4(10, 20);

    }
}