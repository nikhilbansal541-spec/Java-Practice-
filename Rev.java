/*import java.util.Scanner;
public class Rev {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        int Rem;
       

        while(a!=0){
            Rem = a %10;
            rev =  (rev*10)+ Rem;
            a = a/10;





        }
        System.out.println(rev);// if we want to check the pallindrome just add the temp variable and put the number into 
        // the temp then if  temp == rev then it is a pallindrome number 

    }

    }*/

    /*import java.util.Scanner;
    public class Rev{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String og = sc.nextLine();
            String rev  = new StringBuilder(og).reverse().toString();
            System.out.println(rev);
        

        }
    }*/
  import java.util.Arrays;

/*public class Rev {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}*/
public class Rev{
    public static void main(String[] args) {
        
        int[] numbers = {12, 5, 45, 18, 2, 33};

        
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; 
            }
            if (numbers[i] > largest) {
                largest = numbers[i];  
            }
        }
        System.out.println(smallest);
        System.out.println( largest);
        
    }
}
