// import java.util.Scanner;
// public class Calculator {
//     public static void main(String args[]) {

//         int sub;
//         int mult;
//         int sum ;

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         if (a==1){
//             sum = b +c;
//             System.out.println(sum);


//         }
//         else if (a==2){
//             sub = b-c ;
//             System.out.println(sub);

            
//         }
//         else {
//             mult = b*c;
//             System.out.println(mult);

//         }


//     }
// }
// Parent class showing Method Overloading

// class Calculator {
//     void add(int a, int b) {
//         System.out.println("Sum of 2 numbers: " + (a + b));
//     }
//     void add(int a, int b, int c) {
//         System.out.println("Sum of 3 numbers: " + (a + b + c));
//     }
// }
// class AdvancedCalculator extends Calculator {
//     @Override
//     void add(int a, int b) {
//         System.out.println("Advanced Sum: " + (a + b));
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//               AdvancedCalculator calc = new AdvancedCalculator();
//         calc.add(5, 10, 15); 
//         calc.add(5, 10); 
//     }
// }

import java.util.Scanner;
class Calculator{
    public staticvoid main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        for ( int i =0 ;i<=n;i++){
            sum+=i;        }
            System.out.println(sum);
    }
}
