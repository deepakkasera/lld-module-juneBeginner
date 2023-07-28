package designpatterns.factory.components;

public class AndroidButton implements Button {
    @Override
    public void printButton() {
        System.out.println("Android Button");
    }
}
