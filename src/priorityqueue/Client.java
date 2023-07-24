package priorityqueue;

import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        priorityQueue.add(50);
//        priorityQueue.add(5);
//        priorityQueue.add(10);
//        priorityQueue.add(20);
//        priorityQueue.add(15);
//        priorityQueue.add(30);
//        priorityQueue.add(40);
//        priorityQueue.add(25);
//
//        for (Integer integer : priorityQueue) {
//            System.out.print(integer + " ");
//        }

        PriorityQueue<Car> carPQ = new PriorityQueue<>();

        carPQ.add(new Car(10, 100, "A"));
        carPQ.add(new Car(20, 50, "B"));
        carPQ.add(new Car(80, 500, "C"));
        carPQ.add(new Car(40, 200, "D"));
        carPQ.add(new Car(200, 150, "E"));
        carPQ.add(new Car(100, 400, "F"));
        carPQ.add(new Car(50, 300, "G"));

        for (Car car: carPQ) {
            System.out.println(car.toString());
        }
    }
}
