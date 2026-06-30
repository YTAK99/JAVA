import java.util.ArrayList;
import java.util.Arrays; // 💡 Arrays를 쓰기 위해 import 필요!

public class OrderedPair {
    static class Solution {
        public int solution(int n) {
            ArrayList<int[]> list = new ArrayList<>();
            
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(new int[]{i, n / i});
                }
            }
            
            // 💡 이상하게 나오던 출력 대신 이렇게 해보세요!
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                // 리스트에서 배열을 하나씩 꺼내서 예쁘게 바꿈
                System.out.print(Arrays.toString(list.get(i)));
                if (i < list.size() - 1) {
                    System.out.print(", "); // 순서쌍 사이에 쉼표 넣어주기
                }
            }
            System.out.println("]");
            
            return list.size();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6));    // 테스트 실행
    }
}