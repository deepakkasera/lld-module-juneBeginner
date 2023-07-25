package designpatterns.builder;

public class Client {
    public static void main(String[] args) {

        //Requirements for Builder:-
        /*
        1. If a class has lot of attributes.
        2. We have to validate the attributes before the object gets created.
         */

//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Vivek");
//        builder.setAge(25);
//        builder.setBatch("July22");
//        builder.setGradYear(2023);
//
//        Student st = new Student(builder);

        //Way2 :-

        Student student = Student.getBuilder()
                            .setName("Vivek")
                            .setAge(25)
                            .setGradYear(2022)
                            .build();

//        Student st = new Student();
        //Student student1 = new Student();

        System.out.println("Debug");
    }
}
