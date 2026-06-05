package JavaPractice;
import java.util.Scanner;
public class Day2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.next();
        scanner.nextLine(); 

        System.out.print("Enter Full Name: ");   
        String fullName = scanner.nextLine();

        System.out.print("Favorite Fodd: ");
        String favoriteFood = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n========== USER PROFILE ==========");  
        System.out.println("Username: " + username);    
        System.out.println("Full Name: " + fullName);
        System.out.println("Favorite Food: " + favoriteFood);
        System.out.println("Age: " + age);
        scanner.close();    
    }
}
