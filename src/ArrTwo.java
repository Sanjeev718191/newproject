import java.util.Scanner;

public class ArrTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[2];
        for(int i = 0 ; i<arr.length; i++)
        {
            for(int j =0; j<arr[i].length;j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i =0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length;j++)
                System.out.println(arr[i][j]);
        }
    }
}
