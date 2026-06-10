package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--);
        while (a<10);

        System.out.println("end of program");

        for (int b = 0; b<10; b++)
            System.out.println("b = "+b);
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x = 1; x<limit; x++){
            for(int y = 1; y<=x; y++){
        System.out.print(x);
             }
        System.out.println();
         }
           //for each 
           String[] colors = {"black", "red", "yellow", "white", "blue"};
           for (String color: colors)
            System.out.println("Color: " + color);

           //
           for (int i = 1; i <=10; i++){
            for (int y = 1; y<=10; y++){
                System.out.println();
                 }
           }
           
    }
  
}
