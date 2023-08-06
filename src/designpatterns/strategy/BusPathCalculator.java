package designpatterns.strategy;

public class BusPathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bus Path");
    }
}
