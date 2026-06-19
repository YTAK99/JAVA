import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 한 줄을 통째로 읽어옴 (예: M 25 또는 F 15)
        String line = sc.nextLine(); 
        
        // 2. 읽어온 줄을 공백 단위로 분리해주는 토크나이저 생성
        StringTokenizer st = new StringTokenizer(line, " ");
        
        // 3. 차례대로 꺼내서 사용하기
        String sex = st.nextToken();                 // "M" 또는 "F"
        int age = Integer.parseInt(st.nextToken());  // 나이 정수 변환

        // 4. 조건에 따른 출력 분기 (문자열 비교는 .equals() 사용!)
        if (sex.equals("M")) {
            if (age >= 18) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (sex.equals("F")) {
            if (age >= 18) {
                System.out.println("WOMAN");
            } else {
                System.Joint.println("GIRL");
            }
        }
    }
}