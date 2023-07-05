package threads;

public class Client {
    public static void doSomething() {
        System.out.println("Doing Something...Printed By : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hi..Printed By : " + Thread.currentThread().getName());
        //doSomething();

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("Bye..Printed By : " + Thread.currentThread().getName());
    }
}
