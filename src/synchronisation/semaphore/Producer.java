package synchronisation.producerconsumer;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;

    Producer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }


    @Override
    public void run() {
        //infinite number of producers.
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println(this.name + " is producing, size = " + store.size());
                    store.add(new Object());
                }
            }
        }
    }
}
