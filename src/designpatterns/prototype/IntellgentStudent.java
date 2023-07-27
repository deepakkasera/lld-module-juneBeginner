package designpatterns.prototype;

public class IntellgentStudent extends Student {
    private int iq;

    public IntellgentStudent() {
    }
    public IntellgentStudent(IntellgentStudent student) {
        super(student);
        this.iq = student.iq;
    }
    public IntellgentStudent clone() {
        return new IntellgentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
