package synchronisation.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Queue<Object> store, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        //infinite number of producers.
        while (true) {
//            try {
//                producerSemaphore.acquire();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            producerSemaphore.acquire();
            System.out.println(this.name + " is producing, size = " + store.size());
            store.add(new Object());
            consumerSemaphore.release(); //notify the consumer.
        }
    }
}
