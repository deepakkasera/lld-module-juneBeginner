package lambdas;

public class Client {
    public static void main(String[] args) {

        //Way 1 of calling Interface method.
        DemoFuncInterface way1 = new DemoClass();
        way1.fun();

        //We can't create an object of the interface.
        //Why ? because interfaces are incomplete.
        DemoFuncInterface way2 = new DemoFuncInterface() {
            @Override
            public void fun() {
                System.out.println("Way 2 : Functional Interface Demo");
            }
        };
        way2.fun();

        DemoInterface demoInterface = new DemoInterface() {
            @Override
            public void fun1() {
                System.out.println("Hello");
            }

            @Override
            public void fun2() {
                System.out.println("Hey");
            }
        };

        //Way3 -> Lambda

    }
}
