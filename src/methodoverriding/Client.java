package methodoverriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething(); // Class A

        a = new B();
        a.doSomething(); // Class B

        B b = new B();
        b.doSomething(); // Class B

        //b = new A();
    }
}
