package naveenautomation.StringConcepts;

public class User {

    public static void main(String[] args) {

        // Stirng is a class
        //1. using new keyword

        String str = new String("Hello");

        //2. using literals
        String str1 = "Hello";
        String str2 = "Hello";

        // == reference comparison
        System.out.println(str == str1);

        // value comparison
        System.out.println(str.equals(str1));
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str4 = str.intern();
        System.out.println(str4==str);

        System.out.println("*****************");
        StringBuilder sb = new StringBuilder("Testing");
        sb.append(" Automation");
        System.out.println(sb);
        System.out.println("*****************");
    }
}
