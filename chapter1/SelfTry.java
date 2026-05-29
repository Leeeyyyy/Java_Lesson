package chapter1;

public class SelfTry {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ley";
        s1.age = 21;
        s1.course = "IT";
        s1.introduce();
    }
    class Student{


    
        String name;
        int age;
        String course;

          void introduce(){
            System.out.println("Hi I am "+ name);
          }


    }
}
