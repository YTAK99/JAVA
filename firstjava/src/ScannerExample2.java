import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();
        int inp2 = sc.nextInt();
        int c = (++inp1 + inp2--);

        System.out.printf("a = %d, b = %d, c = %d", inp1, inp2, c);
    }
}