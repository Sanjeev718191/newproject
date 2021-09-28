class MyClass
{
    private final int num1;
    public int num2;
    MyClass()
    {
        num1 = 50_000;
        num2 = 40_00_000;
    }
    final public void show(){
    System.out.println(num1+"  "+num2);
}
}

public class LabA1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
        MyClass obj2 = obj;

    }
}
