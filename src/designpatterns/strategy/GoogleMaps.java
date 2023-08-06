package designpatterns.strategy;

public class GoogleMaps {
    public void findPath(String from, String to, String mode) {
//        PathCalculatorStrategy pathCalculatorStrategy;
//        if (mode.equals("Car")) {
//            pathCalculatorStrategy = new CarPathCalculator();
//        } else if (mode.equals("Bike")) {
//            pathCalculatorStrategy = new BikePathCalculator();
//        } else {
//            pathCalculatorStrategy = new WalkPathCalculator();
//        }
//
//        pathCalculatorStrategy.findPath(from, to);
        //The above code is breaking OCP

        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
