import java.util.Scanner;

public class ConstractorDemo {
    public static void main(String[] args) {
        child abc = new child();
        abc.show();
    }
}
class father{
    private String getname;
    father(){
        getname = "fdkfjkd";
    }

    public String getGetname() {
        return getname;
    }
}
class child extends father{
    public int money;
    public String name;
    child(){
        Scanner s = new Scanner(System.in);
        money = s.nextInt();
        s.nextLine();
        name = s.nextLine();
    }
    public void show(){
        System.out.println(money);
        System.out.println(name);
        System.out.println(getGetname());
    }

}
