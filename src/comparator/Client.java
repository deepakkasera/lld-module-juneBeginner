package comparator;

import priorityqueue.Car;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {
    static class Car {
        //Inner class.
        int speed;
        int power;
        String name;

        Car(int speed, int power, String name) {
            this.speed = speed;
            this.power = power;
            this.name = name;
        }

        @Override
        public String toString() {
            return "( " + this.speed + " " + this.power + " " + this.name + " )";
        }
    }

    static class CarPowerComparator implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.power - o2.power;
            //if o1.power < o2.power -> -ve
            //if o1.power > o2.power -> +ve
            //if o1.power == o2.power -> Zero
        }
    }

    static class CarSpeedComparator implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed - o2.speed;
            //if o1.power < o2.power -> -ve
            //if o1.power > o2.power -> +ve
            //if o1.power == o2.power -> Zero
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Car> carPQ = new PriorityQueue<>(new CarSpeedComparator());

        carPQ.add(new Car(10, 100, "A"));
        carPQ.add(new Car(20, 50, "B"));
        carPQ.add(new Car(80, 500, "C"));
        carPQ.add(new Car(40, 200, "D"));
        carPQ.add(new Car(200, 150, "E"));
        carPQ.add(new Car(100, 400, "F"));
        carPQ.add(new Car(50, 300, "G"));

        for (Car car : carPQ) {
            System.out.println(car.toString());
        }

        //Student student = new Student("Deepak", 25, 90.0);
    }
}
