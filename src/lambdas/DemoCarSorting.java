package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCarSorting {
    static class Car {
        int speed;
        int price;
        String brand;

        Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

//        @Override
//        public int compareTo(Car other) {
//            return this.speed - other.speed;
//        }
        @Override
        public String toString() {
            return "[Speed: " + this.speed + " Price: " + this.price + " Brand: " + this.brand + "]\n";
        }
    }

    static class SpeedComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed - o2.speed;
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(100, 10, "A");
        Car c2 = new Car(50, 60, "B");
        Car c3 = new Car(60, 8, "C");
        Car c4 = new Car(200, 12, "D");
        Car c5 = new Car(30, 14, "E");
        Car c6 = new Car(150, 20, "F");

        List<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

//        SpeedComparator speedComparator = new SpeedComparator();
//        Collections.sort(list, speedComparator);
//
//        System.out.println(list);

        //Sort the list of Cars using Lambda function.
        //Comparator
//        Comparator<Car> comparator = (car1, car2) -> {
//            if (car1.speed == car2.speed) {
//                return car1.price - car2.price;
//            } else {
//                return car1.speed - car2.speed;
//            }
//        };
        //Collections.sort(list, comparator);

        // (func params) -> {logic}; -> Lambdas.
        Collections.sort(list, (car1, car2) -> car2.price - car1.price);
        System.out.println(list);
    }
}
