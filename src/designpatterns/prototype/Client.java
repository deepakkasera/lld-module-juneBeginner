package designpatterns.prototype;

public class Client {
    private static void fillRegistry(StudentRegistry registry) {
        //Student object for aug22 batch
        Student aug22 = new Student();
        aug22.setBatch("August 22 Intermediate");
        aug22.setAverageBatchPsp(75.0);
        registry.register("aug22", aug22);

        IntellgentStudent aug22IntellgentStudent = new IntellgentStudent();
        aug22IntellgentStudent.setBatch("August 22 Intermediate");
        aug22IntellgentStudent.setAverageBatchPsp(75.0);
        registry.register("aug22IS", aug22IntellgentStudent);

        Student sept22 = new Student();
        sept22.setAverageBatchPsp(90.0);
        sept22.setBatch("Sept22 Intermediate");
        registry.register("sept22", sept22);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        //Student madhu = new Student();
        Student madhu = studentRegistry.get("aug22").clone();
        madhu.setName("Madhu");
        madhu.setAge(25);
        madhu.setStudentPsp(85.0);

        Student rahul = studentRegistry.get("aug22").clone();
        rahul.setName("Rahul");
        rahul.setAge(26);
        rahul.setStudentPsp(90.0);

        Student amar = studentRegistry.get("aug22IS").clone();
        amar.setName("Amar");
        amar.setStudentPsp(99.0);
        amar.setAge(26);

        System.out.println("DEBUG");
    }
}
