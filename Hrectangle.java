// import java.util.Scanner;

// public class Hrectangle {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for( int i = 1;i<=a;i++){
//             for ( int j =1;j<=b;j++){
//                 if (i==1 || j==1 || i==a || j ==b){
//                     System.out.print("*");

//                 }else{
//                    System.out.print(" ");
//                 }}
//                 System.out.println();

            
//         }

//     }
    
// }
// 1. Define the Interface
interface Blueprint {
    void interfaceMethod(); // Abstract by default
}

// 2. Define the Abstract Class
abstract class Parent {
    abstract void abstractMethod(); // Must be overridden by child
    
    void concreteMethod() { // Regular method with body
        System.out.println("Called: Concrete method from Parent class.");
    }
}

// 3. Child Class inheriting both
class Child extends Parent implements Blueprint {
    
    // Implementing the Interface method
    @Override
    public void interfaceMethod() {
        System.out.println("Called: Interface method implemented in Child.");
    }

    // Implementing the Abstract Class method
    @Override
    void abstractMethod() {
        System.out.println("Called: Abstract method implemented in Child.");
    }
}

// 4. Main Class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create an object using the Child class type
        Child childObj = new Child();
        
        // Call all available methods via the child object
        childObj.interfaceMethod();
        childObj.abstractMethod();
        childObj.concreteMethod();
    }
}

