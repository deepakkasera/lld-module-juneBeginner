package designpatterns.factory;

import designpatterns.factory.components.AndroidButton;
import designpatterns.factory.components.AndroidDropDown;
import designpatterns.factory.components.Button;
import designpatterns.factory.components.DropDown;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
