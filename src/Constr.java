public class Constr {
    int num1;
    int num2;
    Constr()
    {
        num1 = 949234;
        num2 = 4398;
    }
    public void show()
    {
        System.out.println(num1);
        System.out.println(num2);
    }

}
class Constrmain
{
    public static void main(String[] args) {
        Constr xyz = new Constr();
        xyz.show();

    }
}
