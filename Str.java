// rev a string without using built in methods
import java.util.Scanner;
class Str{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
// // public class Str {
// //     public static void main(String[] args) {
// //         String str = "sample string";
// //         int[] count = new int[256];
// //         char maxChar = ' ';
// //         int maxFreq = -1;

// //         // Count character frequencies
// //         for (int i = 0; i < str.length(); i++) {
// //             count[str.charAt(i)]++;
// //         }

// //         // Find the maximum frequency
// //         for (int i = 0; i < str.length(); i++) {
// //             if (count[str.charAt(i)] > maxFreq) {
// //                 maxFreq = count[str.charAt(i)];
// //                 maxChar = str.charAt(i);
// //             }
// //         }

// //         System.out.println("Max character: " + maxChar);
// //     }
// // }
// // class Str{
// //     static void main(String [] args){
// //         String str1 = "xyz";
// //         str1.replace('x','@');
// //     System.out.println(str1);    }

// // }
// public class Str {
//     public static void main(String[] args)
//     {
//         StringBuilder sb
//             = new StringBuilder("GeeksforGeeks");
//         System.out.println("Initial StringBuilder: " + sb);

//         sb.append(" is awesome!");
//         System.out.println("After append: " + sb);
//     }
// }
// public static void main(String[] args) {
//         StringBuilder s=new StringBuilder("QWERTY");
//         System.out.println(s.reverse());
