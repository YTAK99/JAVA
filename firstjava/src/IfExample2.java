import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args) {
        System.out.print("1. 삽입\n2. 수정\n3. 삭제\n숫자를 선택하세요. ");
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();

        if (inp1 == 1) {
            System.out.print("삽입을 선택하셨습니다.");
        }
        else if (inp1 == 2) {
            System.out.print("수정을 선택하셨습니다.");
        }
        else if (inp1 == 3) {
            System.out.print("삭제를 선택하셨습니다.");
        }
        else {
            System.out.print("잘못 입력하셨습니다.");
        }
    }
}