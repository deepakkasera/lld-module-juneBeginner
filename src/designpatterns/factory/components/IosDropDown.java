package designpatterns.factory.components;

public class IosDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Ios Dropdown");
    }
}
