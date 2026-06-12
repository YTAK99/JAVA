import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.print("두 개의 수를 입력하시오. ");
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();
        int inp2 = sc.nextInt();

        String a = sc.nextLine();

        sc.close();

        System.out.printf("7 + 5 = %d \n", inp1 + inp2);
        System.out.printf("7 - 5 = %d \n", inp1 - inp2);
        System.out.printf("7 * 5 = %d \n", inp1 * inp2);
        System.out.printf("7 / 5 = %d \n", inp1 / inp2);
        System.out.println("7 % 5 = " + inp1 % inp2);

        System.out.println(a);
    }
}

// next() → 단어 하나
// nextLine() → 한 줄 전체
// nextInt() → 숫자 하나