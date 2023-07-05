package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        File file = new File("abc.txt");
        FileReader reader = null;
        reader = new FileReader(file);
        System.out.println("Hi");
        reader.read();
        System.out.println("Bye");

        readFromFile("abc.txt");
    }

    public static void readFromFile(String fileName) {
//        File file = null;
//        FileReader reader = null;
//        try {
//            System.out.println("Hello");
//            file = new File(fileName);
//            reader = new FileReader(file)//exception will happen here.
//            reader.read();
//            System.out.println("Hi");
//        } catch (Exception exception) {
//            System.out.println("Exception has occured, Don't " +
//                    "worry We are checking this");
//        }
//        finally {
//            System.out.println("Finally Block");
//        }
//        System.out.println("Outside try-catch block");
//        /*
//        It will execute, because the code is not stopping abruptly.
//         */

    }
}
