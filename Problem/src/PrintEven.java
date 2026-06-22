import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[count] = n;
            count++;
        }

        for (int i = 1; i < count; i += 2) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}