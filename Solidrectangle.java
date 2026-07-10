import java.util.Scanner;
public class Solidrectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();

        for ( int i = 1;i<=s;i++){
            for ( int j =1 ;j<=m;j++){
                System.out.print("*");

            }
            System.out.println();

        }

    }
}