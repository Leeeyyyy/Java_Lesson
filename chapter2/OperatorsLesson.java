package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean isActive= false;
        //a + a++; pwede
        System.out.println(--a+ a++); //9+ 10
        System.out.println(a);
        System.out.println(-b);
        System.out.println(!!!!isActive);
        System.out.println(5/2);
        System.out.println(5%2);

        //shift operators
        System.out.println("3<<2="+(3<<2));
        //0 0 0 1 1 0 0
        //      8 4 2 1
        //      1 1 0 0 = 8+4 = 12

        //numerical promotional // the highest data magiging promotion nung mga small data type
        // such as char byte will be promoted into int data type or int + long = long
        System.out.println(10/10.0);

        int g = (int)3.0; //int below such as byte can put in () cant put higher than int
        System.out.println(g);
        short x = 10;
        short y = 3;
        short z = (short)(x*y);
        System.out.println(z);
    }
}
