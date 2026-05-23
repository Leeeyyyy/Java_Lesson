package chapter1;
import java.util.Date;

public class ReferenceTypeLesson {

    Date today;
    String greeting;

    public static void main(String[] args) {
        ReferenceTypeLesson rtl1 = new ReferenceTypeLesson();
        
        rtl1.today = new Date();
        rtl1.greeting = new String();
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        Toy toy3 = toy1;
        String Name;
        int age;
        String name = "Ley";
        int age = 21;
        System.out.println(name, age);
        System.out.println("end of program");
    }
}
