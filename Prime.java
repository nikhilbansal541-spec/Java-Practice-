import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fac=0;
        for ( int i = 2;i<a/2;i++){
            if ( a%i==0){
                fac++;

            
            }
        }
        if (fac==0){
            System.out.println("it is prime");

        }else {
            System.out.println("Not a prime");

        }



    }
    
}
