import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("세 수를 입력하세요. ");
        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int n : arr) {
            if (n >= max) {
                max = n;
            }
        }
        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", max);
    }
}