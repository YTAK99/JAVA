public class ArrayEx {
    public static void main(String[] args) {

        char[] arr = new char[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('A' + i);
        }

        for (int i = 25; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}