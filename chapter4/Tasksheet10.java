package chapter4;

class Student{
private String firstName;
    private String lastName;
    public Student (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public void printFullName() {
            System.out.println(getFirstName() + " " + getLastName());
        }
    
}   
public class Tasksheet10 {
    
    public static void main(String[] args) {
        Student [] students = new Student[]{
            new Student ("Morgan", "Freeman"),
            new Student ("Brad", "Pitt"),
            new Student ("Kevin", "Spacey"),
        };
        for (Student s: students){
            s.printFullName();
        }
    }


}
