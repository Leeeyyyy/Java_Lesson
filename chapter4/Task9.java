package chapter4;
import static java.lang.Math.*;
public class Task9 {
    public static int add(int a, int b){
        return addExact(a,b);
    }
    public static int subtract(int a, int b){
        return subtractExact(a, b);
    }
    public static int multiply(int a, int b){
        return multiplyExact(a, b);
    }
    public static float division (int a, int b){

        if (a == 0 || b == 0){
            System.out.println("Cannot divide by 0");
            return 0;
        }
        return floorDiv(a, b);
    }

    
    public static void main(String[] args) {

          int num1 = 300;
          int num2 = 0;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + division(num1, num2));
    }
}
