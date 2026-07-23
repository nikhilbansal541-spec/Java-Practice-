// class Animal {
//     void eat() { System.out.println("Eating..."); }
// }

// // Dog inherits Animal
// class Dog extends Animal {
//     void bark() { System.out.println("Barking..."); }
// }

// class Animal {
//     void eat() { System.out.println("Eating..."); }
// }

// class Dog extends Animal {
//     void bark() { System.out.println("Barking..."); }
// }


// class BabyDog extends Dog {
//     void weep() { System.out.println("Weeping..."); }
// }

// class Animal {
//     void eat() { System.out.println("Eating..."); }
// }

// // Both Dog and Cat extend Animal
// class Dog extends Animal {
//     void bark() { System.out.println("Barking..."); }
// }

// class Cat extends Animal {
//     void meow() { System.out.println("Meowing..."); }
// }

// make a class  in which you made variable method constructor  and call all three using super keyword 
// class Parent {
//     String msg = "Parent Var";
//     Parent() { System.out.println("Parent Con"); }
//     void show() { System.out.println("Parent Met"); }
// }

// class Child extends Parent {
//     Child() {
//         super(); // Calls constructor
//         super.show(); // Calls method
//         System.out.println(super.msg); // Calls variable
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         new Child(); // Triggers all three calls
//     }
// }

// Parent class showing Method Overloading
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }  
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}

class AdvancedCalculator extends Calculator {  
    @Override
    void add(int a, int b) {
        System.out.println("Advanced Sum: " + (a + b));
    }
}
public class Main {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();  
        calc.add(5, 10, 15); 
        calc.add(5, 10); 
    }
}
