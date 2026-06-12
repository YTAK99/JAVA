public class LoopEx {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i);

            if (i == 6)
                break;

            i = i + 1;
        }

        int j = 10;
        for (; ; ) {
            System.out.println(j);
            
            if (j == 15)
                break;
            j += 1;
        }
    }
}
