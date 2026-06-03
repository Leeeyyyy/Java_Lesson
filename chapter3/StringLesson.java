package chapter3;

public class StringLesson {
    public static void main(String[] args) {
         String name = "fluffy";
        String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        String name2 = "fluffy";
        name = null;
        name2 = null;
        String name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        System.out.println(word1.length());
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
        String limitString="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println(limitString);
        String limString = "abcde";
        String limString2 = "abcde";
        System.out.println(limitString==limString);
        System.out.println(limString2==limString);
        String firstName = "Ley";
        System.out.println(firstName.charAt(2));
        System.out.println(firstName.indexOf("L"));
        System.out.println("Ley".startsWith("L"));
        System.out.println("Khy".startsWith("A"));
        System.out.println("Inuyasha".contains("sha"));
        System.out.println("abcde".replace("a","A"));
    }
}