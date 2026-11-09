
package javalab;

class Grandparent {
    void show() {
        System.out.println("This is grandparent");
    }
}

class Pa extends Grandparent {
    void display() {
        System.out.println("This is parent");
    }
}

class Ch extends Pa {
    void print() {
        System.out.println("This is child");
    }
}

public class SE5b {
    public static void main(String[] args) {
        Ch obj = new Ch();

        obj.show();
        obj.display();
        obj.print();
    }
}