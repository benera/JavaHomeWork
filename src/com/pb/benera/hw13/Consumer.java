package com.pb.benera.hw13;

public class Consumer implements Runnable {
    private final Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println ("Потребитель стартует......");
        int count = 0;
        while (count < 5) {
            try {
                int item = queue.get ( );
                count++;
                System.out.println ("Потребитель прочитал элемент: " + item);
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
        }

    }
}
