package chapter3;
import java.util.*;
public class ArrayListDemo {

    public static void main(String[] args) {
        //Object use inside  of <> means we can add any type of data in the list
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add(18);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(22);
        list2.add(23);
        list2.add(24);
        list2.add(25);
        System.out.println(list2.add(26));
        //adding in index, element
        list2.add(5, 30);
        System.out.println(list2);
        //removing element by index
        list2.remove(5); // removing 30  because it is in index 5
        System.out.println(list2);
        //removing element by value
        list2.remove(Integer.valueOf(26)); // removing 26 because it is in index 5
        System.out.println(list2);
        list2.set(0, 20); // changing 21 to 20 because it is in index 0 
        System.out.println(list2);
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());
        //list2.clear(); // clear all the elements in the list
        //list2.clear();
        System.out.println(list2);
        list2.add(0, 100);
        System.out.println(list2);
        //equal method
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        System.out.println(list3.equals(list4)); // true because both list are empty
        list3.add(20);
        list4.add(21);
        System.out.println(list3.equals(list4)); // false because the lists have different elements

        //int, string, double, char, boolean are primitive data types
        //Integer, String, Double, Character, Boolean are wrapper classes for the primitive data types
        // we can use wrapper classes to create objects of the primitive data types
        
        Integer num1 = 10; // autoboxing, converting primitive int to Integer object
        Integer num2 = Integer.valueOf(30); // autoboxing, converting primitive int to Integer object
        System.out.println(num2);
        System.out.println(num2.equals(num1)); // false because num2 is 30 and num1 is 10

        Object[] objectArray = list2.toArray(); // converting list to array
        System.out.println(Arrays.toString(objectArray));    // converting list to array and printing the array
        list2.remove(1); // removing element at index 1
        System.out.println(list2);
        
                ArrayList<Integer> numbers = new ArrayList<>();
                    numbers.add(1);
                    numbers.add(2);
                    numbers.remove(1);
                    System.out.println(numbers);
                    ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
                    System.out.println(list5);
                    list5.add(5,6);
                    System.out.println(list5);
    }
}
