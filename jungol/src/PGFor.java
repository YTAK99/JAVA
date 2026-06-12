package Problem;

public class PGFor {
   public static void main(String[] args) {
       char ch = 'A';

       for (int i = 0; i < 26; i++) {
           System.out.print(ch++);
       }
   }
}

// public class Main {
//     public static void main(String[] args) {
//         for (char c = 'A'; c <= 'Z'; c++) {
//             System.out.print(c + "");
//         }
//     }
// }