package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.DropDown;

import java.nio.Buffer;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();

        flutter.refresh();
        flutter.setTheme();
        button.printButton();
        dropDown.showDropDown();

        System.out.println("DEBUG");
    }
}
