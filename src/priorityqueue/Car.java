package priorityqueue;

public class Car implements Comparable<Car> {
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

    @Override
    public int compareTo(Car other) {
        return other.speed - this.speed;
    }
}
