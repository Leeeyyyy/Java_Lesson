package chapter3;
//STRINGBUILDER LESSOn
public class Junetwo {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.insert(10, "Listen");
        System.out.println(sb);
    }
}
