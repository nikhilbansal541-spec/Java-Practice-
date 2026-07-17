/*import java.util.Scanner;

public class Righttri {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // this is for the right angle triangle i created alll desgin in this file 
        for ( int i = 1;i<=a;i++){
            for (int j =1 ;j<=i;j++){
                System.out.print("*");

            }
        System.out.println();
        }
        
    }
    
}*/
/*import java.util.Scanner;
public  class Righttri{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i= a;i>=1;i--){                 // all arev same we change just ouuter loop condition in the inverted right angle triangle
            for ( int j=1 ;j<=i;j++){
                System.out.print("*");

            }System.out.println();

        }
    }
}
*/

/*  printing right side triangle in which 1 star started from right corner 
 import java.util.Scanner;
 public class Righttri{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        for ( int i =1;i<=a;i++ ){
            for (int j = 1 ;j<=a-i;j++){
                System.out.print(" ");



            }
            for (int j =1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");

        }


    }
 }*/
/*Printing number in the form of right triangle in the increaame of each row like 
1 
12
123
1234
 */
/*import java.util.Scanner;
public class Righttri{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for ( int i=1;i<=a;i++)
        {for (int j= 1;j<=i;j++){
            System.out.print(j+"");
        }
System.out.println();
        }

    }
}*/
/*import java.util.Scanner;
public class Righttri{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int i = 1;i<=a;i++){
            for ( int j =1;j<=a-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
     
        }
    }
}*/
/*import java.util.Scanner;
public class Righttri{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
         
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum =0 ;
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; 
        }
        double average = (double) sum / size;
        System.out.println(average);

    }
}*/
// import java.util.Scanner;
// public class Righttri{
//     public static void  main(String args[]){
//         int n =5;
//         for (int i=1;i<=5;i++){
//             for (int j =1;j<=i;j++){
//                 System.out.print(" *");

//             }
//             System.out.println();
//         }

//     }
// }
// import java.util.Scanner;
// public class Righttri {
//     public static void main(String args[]){
//         int rows =5;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");    }
//                 System.out.println();
//         }}}
