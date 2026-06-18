
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];       // 최댓값. (최솟값은min으로)
        for(int n : arr){
            if(n > max){
                max = n;
            }
        }
        boolean r1 = max==arr[0];

        
        boolean r2 = (arr[0]==arr[1]) && (arr[1]==arr[2]) && (arr[0]==arr[2]);


        System.out.print((r1 ? 1:0) + " " + (r2 ? 1:0));
    }
}