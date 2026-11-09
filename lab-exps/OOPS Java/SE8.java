
package javalab;

abstract class Shape {
    int a = 10, b = 5;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Rectangle area = " + (a * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Triangle area = " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Circle area = " + (3.14 * a * a));
    }
}

public class SE8 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}