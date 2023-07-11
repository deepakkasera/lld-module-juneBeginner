package inheritence;

public class D extends C {
    D() {
        super("Hello"); // C() // This must be the first line inside the constructor.
        System.out.println("Constructor of D");
    }

//    D(String str) {
//        this(); // this -> constructor of same class.
//        System.out.println("Constructor of D with param");
//    }
}

/*
A
|
B
|
C
|
D
*/