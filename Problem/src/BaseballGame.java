import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] computer = new int[3];
        int[] user = new int[3];

        // 1. 컴퓨터의 중복 없는 랜덤 숫자 3개 생성
        for (int i = 0; i < computer.length; i++) {
            computer[i] = random.nextInt(9) + 1; // 1 ~ 9 사이의 난수
            
            // 중복 검사: 이전에 뽑은 숫자와 같으면 다시 뽑기
            for (int j = 0; j < i; j++) {
                if (computer[i] == computer[j]) {
                    i--; // 인덱스를 뒤로 빽해서 다시 뽑게 만듦
                    break;
                }
            }
        }

        System.out.println("⚾ 숫자 야구 게임을 시작합니다! (1~9 사이의 숫자 3개)");
        // 디버깅용 정답 확인 (테스트하고 싶다면 아래 주석을 해제하세요)
        // System.out.println("정답 미리보기: " + computer[0] + " " + computer[1] + " " + computer[2]);

        // 2. 게임 루프 시작 (3 스트라이크가 나올 때까지 반복)
        while (true) {
            int strike = 0;
            int ball = 0;

            // 사용자 입력 받기
            System.out.print("숫자 3개를 띄어쓰기로 입력하세요 (예: 1 2 3): ");
            for (int i = 0; i < user.length; i++) {
                user[i] = sc.nextInt();
            }

            // 3. 판정하기 (컴퓨터 숫자와 사용자 숫자 비교)
            for (int i = 0; i < computer.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (computer[i] == user[j]) { // 숫자가 일치할 때
                        if (i == j) {
                            strike++; // 자리까지 같으면 스트라이크
                        } else {
                            ball++;   // 자리는 다르면 볼
                        }
                    }
                }
            }

            // 4. 결과 출력
            if (strike == 0 && ball == 0) {
                System.out.println("아웃(OUT)!");
            } else {
                System.out.printf("%d 스트라이크, %d 볼\n", strike, ball);
            }

            // 3 스트라이크면 탈출
            if (strike == 3) {
                System.out.println("🎉 축하합니다! 정답을 맞추셨습니다. 게임을 종료합니다.");
                break;
            }
            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}