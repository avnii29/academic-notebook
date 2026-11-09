
package javalab;

import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class CE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null, tail = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            Node newNode = new Node(num);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();

        Node cur = head;

        while (cur != null && cur.data != key) {
            cur = cur.next;
        }

        if (cur != null) {
            if (cur.prev != null)
                cur.prev.next = cur.next;
            else
                head = cur.next;

            if (cur.next != null)
                cur.next.prev = cur.prev;
        }

        System.out.println("List after deletion:");

        cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}