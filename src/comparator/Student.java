package comparator;

import javax.xml.namespace.QName;

public abstract class Student {
    String name;
    int age;
    double psp;

    Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }
    public void printStudent() {
        return;
    }
}

//If we have an abstract method, class should be abstract.
//A class can be abstract if we don't have any abstract method.
