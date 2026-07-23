import java.util.Scanner;
public class Test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ab = sc.nextLine();
    ab = ab.toLowerCase();
    int vowels =0 ;
    int consta = 0;

for ( int i= 0 ;i<ab.length();i++){
    char ch = ab.charAt(i);


 if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consta++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consta);
    }
    
}
import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        StringBuilder sb = new StringBuilder(ab);
sb.reverse();
System.out.println(sb);
        

    }
}

import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
       

        StringBuilder sb = new StringBuilder(ab);
sb.reverse();
String reversed = sb.toString();
        
   
        if (ab.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }}


 import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        int word = ab.split(" ").length;
        System.out.println("Words:  " +word);
    }}

 import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        String og = ab.toUpperCase();
        System.out.println(og);}}
 import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
      
       char y = sc.next().charAt(0);
       int count =0 ;
       for (int i=0 ;i<ab.length();i++){
        if (ab.charAt(i)==y){
            count++;
        }}
        System.out.println(count);

     }}
 import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
                for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == i && str.lastIndexOf(c) != i) {
                System.out.println(c);
            }
        }
    }}

easy methhod
 import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    
                }}}   }}

public class Test{
    public static void main(String[] args) {
        String str="aaaaabhhhbddg";
        int count=1;
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(sb);
    }
}

      
      


