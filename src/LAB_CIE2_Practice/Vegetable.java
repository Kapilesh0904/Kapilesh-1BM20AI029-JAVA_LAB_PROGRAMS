package LAB_CIE2_Practice;

import java.util.Random;

class Market {
    String[] buffer;
    int capacity,count,in,out;

    public Market(int size) {
        buffer = new String[size];
        capacity = size;
        count = 0;
        in = 0;
        out = 0;
    }

    public void produce() throws InterruptedException {
        String value;
        synchronized (this) {
            while (count == capacity)
                wait();

            value = getRandomVegetable();
            buffer[in] = value;
            in = (in + 1) % capacity;
            count++;
            System.out.println("Producer produced: " + value);
            notify();
        }
    }

    public void consume() throws InterruptedException {
        String value;
        synchronized (this) {
            while (count == 0)
                wait();

            value = buffer[out];
            out = (out + 1) % capacity;
            count--;
            System.out.println("Consumer consumed: " + value);
            notify();
        }
    }
    private String getRandomVegetable() {
        String[] allVegetables = {"carrot", "lettuce", "cucumber", "tomato", "pepper"};
        Random rand = new Random();
        return allVegetables[rand.nextInt(allVegetables.length)];
    }
}

public class Vegetable {
    public static void main(String[] args) throws InterruptedException {
        Market obj = new Market(5);

        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    obj.produce();
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    obj.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}