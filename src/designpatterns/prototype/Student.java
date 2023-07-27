package designpatterns.prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double studentPsp;
    private String batch;
    private double averageBatchPsp;

    public Student() {}
    public Student(Student st) {
        this.name = st.name;
        this.age = st.age;
        this.studentPsp = st.studentPsp;
        this.averageBatchPsp = st.averageBatchPsp;
        this.batch = st.batch;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }
}
