package designpatterns.factory;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatforms platforms) {
        if (platforms.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUIFactory();
        } else if (platforms.equals(SupportedPlatforms.IOS)) {
            return new IosUIFactory();
        }
        return null;
    }
}
