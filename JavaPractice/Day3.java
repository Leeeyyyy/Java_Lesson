package JavaPractice;
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        
        /*Scanner scanner = new Scanner (System.in);
            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age >= 18){
                System.out.println("You are an adult.");
            } else{
                System.out.println("You are a minor.");
            }
           scanner.close();*/ 
           
           Scanner scan = new Scanner(System.in);
           System.out.print("Input your Grade: ");
           int grade = scan.nextInt();
           

           if (grade > 100){
            System.out.println("Invalid Grade");
           } else if (grade >=90){
            System.out.println("Excellent");
           } else if (grade >=75) {
            System.out.println("Passed");
           } else if (grade >= 0) {
            System.out.println("Failed");
           } else {
            System.out.println("Invalid Grade");
           }
           
           scan.close();


    }
}
