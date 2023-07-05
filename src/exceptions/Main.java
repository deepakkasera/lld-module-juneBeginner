package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        func(sc);
    }

    public static void func(Scanner sc) {
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch (NullPointerException exception) {
            exception.getMessage();
            System.out.println("NPE");
        } catch (InputMismatchException exception) {
            System.out.println("InputMismatchException");
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException");
        } catch (Exception exception) {
            System.out.println("Exception");
        }
    }
}
