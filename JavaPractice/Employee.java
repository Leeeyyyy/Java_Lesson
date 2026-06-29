package JavaPractice;
//Overriding Lesson
public class Employee {

    private String firstName;
    private String lastName;
    private String title;
    private int age;
    private int address;
    private int sex;

    Employee(String firstName,String lastName, String title, int age,int address, int sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }
    
    class Main{
        public static void main(String[] args) {
            Employee Employee = new Employee(null, null, null, 0, 0, 0)
        }
    }
}
