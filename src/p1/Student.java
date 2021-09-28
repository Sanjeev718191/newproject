package p1;

public class Student {
    protected int rollno;
    public String name;

    public Student() {
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public void show(){
        System.out.println(rollno + "  " + name);
    }
}
