package com.pb.benera.hw13;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue ( );
        new Thread (new Producer (queue)).start ( );
        Thread.currentThread ( ).sleep (1000);
        new Thread (new Consumer (queue)).start ( );
    }
}
