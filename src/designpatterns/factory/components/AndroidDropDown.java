package designpatterns.factory.components;

public class AndroidDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Android Dropdown");
    }
}
