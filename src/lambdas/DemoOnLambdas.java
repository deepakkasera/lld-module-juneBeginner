package lambdas;

import java.sql.SQLOutput;
import java.util.function.*;

public class DemoOnLambdas {
    public static void main(String[] args) {
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s);
            }
        };
        consumer1.accept("Scaler");

        //Lambda
        //() -> pass the function arguments.
        //{} -> implementation
        Consumer<String> consumer2 = (str) -> {
            System.out.println("Hello " + str);
        };
        consumer2.accept("Interviewbit");


        BiPredicate<String, String> biPredicate1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.length() > s2.length();
            }
        };
        System.out.println(biPredicate1.test("Hello", "Hey"));

        BiPredicate<String, String> biPredicate2 = (s1, s2) -> {
            return s1.length() > s2.length();
        };
        System.out.println(biPredicate2.test("Hello", "Hey"));

        BinaryOperator<String> binaryOperator1 = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + s2;
            }
        };
        System.out.println(binaryOperator1.apply("Hello", " Scaler"));

        BinaryOperator<String> binaryOperator2 = (s1, s2) -> {return s1+s2;};
        System.out.println(binaryOperator2.apply("Hello"," Scaler"));
    }
}
