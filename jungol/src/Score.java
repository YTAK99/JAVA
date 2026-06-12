package Problem;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        if (90 <= inp && inp <= 100) {
            System.out.print("A");
        }
        else if (80 <= inp && inp <= 89) {
            System.out.print("B");
        }
        else if (70 <= inp && inp <= 79) {
            System.out.print("C");
        }
        else if (60 <= inp && inp <= 69) {
            System.out.print("D");
        }
        else if (0 <= inp && inp <= 59) {
            System.out.print("F");
        }
    }
}