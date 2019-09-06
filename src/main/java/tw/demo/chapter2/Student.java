package tw.demo.chapter2;

public class Student extends People {
    private double studentOnly;
    protected int height =4;
    protected int weight =3;

    public double getStudentOnly() {
        return studentOnly;
    }

    public void setStudentOnly(double studentOnly) {
        this.studentOnly = studentOnly;
    }
}
