
package javalab;

class Parent {
    void show() {
        System.out.println("This is parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child");
    }
}

public class SE5a {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.show();
        obj.display();
    }
}