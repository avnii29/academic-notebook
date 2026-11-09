
package javalab;

interface A1 {
    void show();
}

interface B1 extends A1 {
    void display();
}

class Demo implements B1 {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class CE16 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
        obj.display();
    }
}