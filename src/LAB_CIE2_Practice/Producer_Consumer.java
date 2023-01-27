package LAB_CIE2_Practice;

class PC {
    int[] buffer;
    int capacity;
    int count;
    int in;
    int out;

    public PC(int size) {
        buffer = new int[size];
        capacity = size;
        count = 0;
        in = 0;
        out = 0;
    }

    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (count == capacity)
                wait();

            buffer[in] = value;
            in = (in + 1) % capacity;
            count++;
            System.out.println("Producer produced: " + value);
            notify();
        }
    }

    public int consume() throws InterruptedException {
        int value;
        synchronized (this) {
            while (count == 0)
                wait();

            value = buffer[out];
            out = (out + 1) % capacity;
            count--;
            System.out.println("Consumer consumed: " + value);
            notify();
        }
        return value;
    }
}

public class Producer_Consumer {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC(5);

        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    pc.produce(i);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    pc.consume();
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