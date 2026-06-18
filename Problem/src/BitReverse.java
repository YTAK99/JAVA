import java.util.*;

public class BitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();

        int result1 = a==b ? 1 : 0;
        int result2 = b==c ? 1 : 0;

        System.out.printf("%d %d %d %d", result1, result2, result1^1, result2^1);
        // XOR로 비트 반전
    }
}

// int result3 = a!=b ? 1 : 0;
// int result4 = a!=b ? 1 : 0;