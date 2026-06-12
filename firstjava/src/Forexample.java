// 1부터 N까지의 합 구하기

import java.util.Scanner;

public class Forexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=inp;i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
