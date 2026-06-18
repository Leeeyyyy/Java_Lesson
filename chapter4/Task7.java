package chapter4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an Arithmetic Operator");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        System.out.print("Enter Arithmetic Operator (1-4): ");
        int operator = scan.nextInt();

        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int result = 0; 
        boolean validOperator = true;

        switch (operator) {
            case 1:
                result = num1 + num2;
                break; 
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid choice selected.");
                validOperator = false;
                break;
        }

        if (validOperator) {
            System.out.println("The result is: " + result);
        }
        
        scan.close(); 
    }
}