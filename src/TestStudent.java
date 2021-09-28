
import p1.Student;
public class TestStudent extends Student {
    public TestStudent(int rollno, String name) {
        super(rollno, name);
    }

    public static void main(String[] args) {
        TestStudent obj1 = new TestStudent();
        obj1.show();
        System.out.println(obj1.rollno);

    }
}
