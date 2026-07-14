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

public class Persons {
    private String name;
    private int age;
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void updateAge(int newAge) {
        age = newAge; 
    }

   
    public void updateName(String name) {
        this.name = name; 
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
   public static void main(String[] args) {
        Persons p = new Persons("Alice", 20);
        p.displayInfo();
        p.updateName("Bob");
        p.updateAge(22);
        p.displayInfo();
    }

}