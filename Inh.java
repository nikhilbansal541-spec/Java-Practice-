public class Inh {
    public static void main(String args[]){
        Enginner es = new Enginner();
        es.markAttendance();
        es.attendLab();

    }
    
}
class Student {
    String name;
    int age ;
    void markAttendance(){
        System.out.println("attendance marked" );

    }
}
 class Enginner extends Student{
    void attendLab(){
        System.out.println("Atendace done");

    }

 }