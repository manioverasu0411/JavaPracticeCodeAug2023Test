package naveenautomation.DataConversion;

public class Wrapper_check {

    public static void main(String[] args) {
        String a = "100Test";
        String[] data = a.split("Test");
        String b = data[0];
        int c = Integer.parseInt(b);
        System.out.println(c+20); // 120



    }
}
