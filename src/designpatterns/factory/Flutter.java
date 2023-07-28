package designpatterns.factory;

public class Flutter {
    void refresh() {
        System.out.println("Refreshing");
    }

    void setTheme() {
        System.out.println("Setting theme.");
    }

    //Button createButton();
    //Menu createMenu();
    //DropDown createDropDown():

    //A factory method is required to connect with the UIFactory.
    //This factory method is used to create an object of UIFactory, so to avoid OCP let's move
    //this method to another class.
    public UIFactory createUIFactory(SupportedPlatforms platforms) {
        //Violates OCP.

//        if (platforms.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        } else if (platforms.equals(SupportedPlatforms.IOS)) {
//            return new IosUIFactory();
//        }
//        return null;
        return UIFactoryFactory.createUIFactory(platforms);
    }
}
