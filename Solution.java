// class Recursion1 {
// public static void printSum(int n, int sum) {
// if(n == 0) {
// System.out.println(sum);
// return;
// }
// sum += n;
// printSum(n-1, sum);
// }
// public static void main(String args[]) {
// printSum(5, 0);
// }
// }


// class Car {
//     String brand;
//     int year;
//     public Car(String carBrand, int carYear) {
//         brand = carBrand; 
//         year = carYear;
//     }
//     public void displayDetails() {
//         System.out.println("Car Brand: " + brand);
//         System.out.println("Car Year: " + year);
//     }
//     public static void main(String[] args) {
//         Car myCar = new Car("Toyota", 2026);
//         myCar.displayDetails();
//     }
// }

// public class Persons {
//     private String name;
//     private int age;
//     public Persons(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

    
//     public void updateAge(int newAge) {
//         age = newAge; 
//     }

   
//     public void updateName(String name) {
//         this.name = name; 
//     }

    
//     public void displayInfo() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
//    public static void main(String[] args) {
//         Persons p = new Persons("Alice", 20);
//         p.displayInfo();
//         p.updateName("Bob");
//         p.updateAge(22);
//         p.displayInfo();
//     }

// }
// public class Car{
//     int a=20 ; 
//     int b=30 ;
     
//       static void add(int a, int b)
// {  System.out.println("summ=" + (a + b)); ;}
// public static void main (String args[]){
//     add();
// }}
// public class Car {
//     static int id ;
//     static String b; 
//     static int total;
     
//     static void add() {
//         System.out.println("summ=" + (a + b)); 
//     }

//     public static void main(String args[]) {
//         add(); 
//     }
// }

// class Car {

//     int id;
//     String name;

//     static int totalEmployees = 0;
//     Car(int id, String name) {
//         this.id = id;
//         this.name = name;
//         totalEmployees++;  }

//     void display() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//     }

//     public static void main(String[] args) {

//        Car b1 = new Car(101, "Sagar");
//         Car b2 = new Car(102, "Rahul");
//         Car b3 = new Car(103, "Aman");

//         b1.display();
//         System.out.println();

//         b2.display();
//         System.out.println();

//         b3.display();
//         System.out.println();

//         System.out.println("Total Employees = " + Car.totalEmployees);
//     }
// }
// class Animal{
//    void eat (){
//       System.out.println("hello i am eating ");
//    }
//    void sleep(){
//       System.out.println("hello i am slleping");
//    }
// }
// class Dog extends Animal {

// }
// class Solution {
//    public class Animal{
//    public static void main(String args[])
// {
//    Dog dog = new Dog();
//    dog.eat();
//    dog.sleep();
   

// }}}
class solution {
    void eat() {
        System.out.println("hello i am eating");
    }
    void sleep() {
        System.out.println("hello i am sleeping");
    }
}

class Dog extends solution {
    
}

class Solution {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
