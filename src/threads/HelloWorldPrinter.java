package threads;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello..Printed By : " + Thread.currentThread().getName());
    }
}
