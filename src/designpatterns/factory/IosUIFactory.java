package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.DropDown;
import designpatterns.factory.components.IosButton;
import designpatterns.factory.components.IosDropDown;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
