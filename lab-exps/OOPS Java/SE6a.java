
package javalab;

class Par {
    void show() {
        System.out.println("This is parent");
    }
}

public class SE6a {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

class Chi extends Par {
    void show() {
        super.show();
        System.out.println("This is child");
    }
}