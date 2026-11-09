
package javalab;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }

    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

public class CE15 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "Asha");
        Student s2 = new Student(101, "Asha");
        Student s3 = s1.clone();

        System.out.println("toString: " + s1);
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("getClass: " + s1.getClass());
        System.out.println("clone: " + s3);
    }
}