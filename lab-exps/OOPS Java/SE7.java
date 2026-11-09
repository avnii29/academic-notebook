
package javalab;

class P {
    P() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent method");
    }
}

public class SE7 extends Parent {

    SE7() {
        super();
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        SE7 obj = new SE7();
        obj.show();
    }
}