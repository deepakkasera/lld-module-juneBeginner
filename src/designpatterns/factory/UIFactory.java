package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.DropDown;

import java.nio.Buffer;

public interface UIFactory {
    //This should only contain the factory methods.

    Button createButton(); //factory method ? yes, as it will return the object of corresponding Button.

    DropDown createDropDown();
}
