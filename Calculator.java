import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {

        int sub;
        int mult;
        int sum ;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a==1){
            sum = b +c;
            System.out.println(sum);


        }
        else if (a==2){
            sub = b-c ;
            System.out.println(sub);

            
        }
        else {
            mult = b*c;
            System.out.println(mult);

        }


    }
}
