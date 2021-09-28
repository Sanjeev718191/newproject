/* can be emplemented in tow ways
as a language level feature
as a class arrays
arrays are referance data type
advantage = it is increase the relibility of your code
declecation of two dimentional array

*/
package stumain;
import java.util.Scanner;
public class arraydemo {
    int arr[][];
    int arr2[] = {87,43,433};
    arraydemo() {
        arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        Scanner s = new Scanner(System.in);
        for (int a = 0; a < arr.length; a++) {
            for (int i = 0; i < arr[a].length; i++) {
                arr[a][i] = s.nextInt();
                s.nextLine();
            }
        }
    }

    public void show(){
        for(int a = 0; a<arr.length; a++){
            for(int i = 0;i<arr[a].length;i++)
                System.out.println(arr[a][i]);
        }
        for(int j = 0; j < arr2.length; j++)
            System.out.println(arr2[j]);
    }
}
class arra{
    public static void main(String[] args) {
        arraydemo obj = new arraydemo();
        obj.show();
        System.out.println(obj.arr2.length);
    }
}