package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocolateCone(
                        new StrawberryScoop(
                                new ChocolateCone(
                                        new ChocoChips(
                                                new OrangeCone()
                                        )
                                )
                        )
                );

        //IceCream iceCream1 = new StrawberryScoop();

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}

//Pizza Shop

