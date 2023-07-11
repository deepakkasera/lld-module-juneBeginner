package Strings;

import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
//
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));
//        System.out.println(System.identityHashCode(s4));


        System.out.println((s1 == s2) + " " + s1.equals(s2));
        System.out.println((s2 == s3) + " " + s2.equals(s3));
        System.out.println((s3 == s4) + " " + s3.equals(s4));

        //Observations :
        // 1. All the strings are pointing to the same value array.

        StringBuffer sb = new StringBuffer();

        System.out.println("DEBUG");
    }
}

//s1 -> value@738
//s2 -> value@738
