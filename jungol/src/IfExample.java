import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();

        if (inp1 >= 80) {
            System.out.print("축하합니다. 합격입니다.");
        }
        else {
            System.out.print("죄송합니다. 불합격입니다.");
        }
    }
}
