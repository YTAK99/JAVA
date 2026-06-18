import java.util.Scanner;

public class TrueFalse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        boolean c = (a!=0) && (b!=0);
        boolean d = (a!=0) || (b!=0);

        System.out.print((c ? 1 : 0) + " " + (d ? 1 : 0) + " \n\n");
        System.out.print("[JAVA] \n" + c + " " + d);
    }
}