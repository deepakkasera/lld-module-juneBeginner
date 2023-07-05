package threads.numbers1to100;

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
