package chapter3;
import java.util.*;

public class ArrayLesson {
    public static void main(String[] args) {
        
        int[] i = new int[3];
        int [] numbers2 = new int []{1,54,75};
        int [] numbers3 = {1,54,75};
        int [] numbers4 = {1,54,75,5,76,34,7,3,8,10,34};
        Student []  batch2 = {new Student(), new Student(), new Student(), new Student()};
        Arrays.sort(numbers4);
        System.out.println(binarySearch(numbers4, 1)   );// need to learn
        for (int number4 : numbers4) {
            System.out.print(number4 + ",");
            System.out.println();
        }
        //String array = the numbers are sorted as string, not as numbers
        String [] numberString  = {"1","54","75","5","76","34","7","3","8","10","34"};
        Arrays.sort(numberString);
        for (String number : numberString) {
            System.out.print(number + ",");
            System.out.println();
        }

        //for (int j =  0; j <numbers3.length; j++) {
          //  System.out.println(numbers3[j]);
        //}   
    }

}

    class Student{
        String fullName;
        int age;
        String address;
        String course;
        int yearLevel;
    }
// need to learn and search for the asmmetric multidimensional array.