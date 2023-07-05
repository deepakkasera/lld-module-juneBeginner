package threads.executorservice;

public class NumberPrinter implements Runnable {
    int numberToPrint;

    NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " - Printed by thread : " + Thread.currentThread().getName());
    }
}
