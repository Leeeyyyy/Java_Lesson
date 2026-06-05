package chapter3;
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Second Number: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Third Number: ");
        int number3 = scanner.nextInt();


        
        if (number1 == number2 && number2 == number3) {
            System.out.println("All the numbers are equal");
        } else if (number1 >= number2 && number1 >= number3) {
            if (number1 == number2) {
                System.out.println("The First and Second numbers are the same and largest: " + number1);
            } else if (number1 == number3) {
                System.out.println("The First and Third numbers are the same and largest: " + number1);
            } else {
                System.out.println("The Largest Number is: " + number1);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            if (number2 == number3) {
                System.out.println("The Second and Third numbers are the same and largest: " + number2);
            } else {
                System.out.println("The Largest Number is: " + number2);
            }
        } else {
            System.out.println("The Largest Number is: " + number3);
        }
        




        scanner.close();
    }
}
