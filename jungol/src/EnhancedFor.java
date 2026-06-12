// for([타입변수] : [배열])

public class EnhancedFor {
    public static void main(String[] args) {
        int[] scores = {9, 7, 8, 9, 8};

        int sum = 0;
        for(int s : scores) {
            sum += s;
        }
        System.out.println("sum : " + sum);
    }
}
