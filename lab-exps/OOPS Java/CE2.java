
package javalab;

class Buffer {
    int num;
    boolean available = false;

    synchronized void produce(int num) throws InterruptedException {
        while (available) {
            wait();
        }

        this.num = num;
        available = true;
        System.out.println("Produced: " + num);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + num);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.produce(i);
            }
        } catch (InterruptedException e) {
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.consume();
            }
        } catch (InterruptedException e) {
        }
    }
}

public class CE2 {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}