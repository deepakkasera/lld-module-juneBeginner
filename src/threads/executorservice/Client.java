package threads.executorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(10);
        //If a thread isn't available, it will wait in the Queue until thread becomes available.

        ExecutorService executor = Executors.newCachedThreadPool();
        //Cached Thread Pool creates a new thread if a thread isn't available.
        for (int i = 1; i <= 100; i++) {
//            if (i == 100) {
//                System.out.println();
//            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
        executor.shutdown();
    }
}
