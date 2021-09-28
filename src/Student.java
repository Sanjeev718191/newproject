public class Student {
    public String name ;
    public int rollno;
    Student(){
        name = "Sanjeev";
        rollno = 49;
    }
    Student(String sn, int rn){
        name = sn;
        rollno = rn;
    }
}
class Demo {
    public static void main(String[] args) {
        Student obj1 = new Student();

    }
}
