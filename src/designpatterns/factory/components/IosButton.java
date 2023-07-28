package designpatterns.factory.components;

public class IosButton implements Button {
    @Override
    public void printButton() {
        System.out.println("Ios Button");
    }
}
