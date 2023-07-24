package designpatterns.singleton.doublechecklocking;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SingletonCallable singletonCallable = new SingletonCallable();
        SingletonCallable singletonCallable1 = new SingletonCallable();
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<DataBaseConnection> dbc = executorService.submit(singletonCallable);
        Future<DataBaseConnection> dbc2 = executorService.submit(singletonCallable1);

        System.out.println(dbc.get());
        System.out.println(dbc2.get());
    }
}
