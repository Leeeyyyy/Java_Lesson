package JavaPractice;
import java.util.Scanner;

public class ScannerExample{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Name: ");  
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter your GPA:" );
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\n========== STUDENT PROFILE ==========");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
        System.out.println("Student GPA: " + gpa);
        scanner.close();


    }
}
//STUDENT ID - NAME- AGE - COURSE -GPA