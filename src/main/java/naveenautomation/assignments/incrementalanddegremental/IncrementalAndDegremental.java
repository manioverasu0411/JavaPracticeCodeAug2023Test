package naveenautomation.assignments.incrementalanddegremental;

public class IncrementalAndDegremental {

    public static void incrementTest1(){
        int i = 11;
        i = i++ + ++i;
        System.out.println(i);   // Expected output = 24
    }

    public static void incrementTest2(){
        int a = 11, b = 22, c;

        c = a+b+ a++ + b++ + ++a + ++b;
        System.out.println(c);  // expected output = 103
    }

    public static void incrementTest3(){
        int i = 0;
        i = i++ - --i + ++i - i--;
        System.out.println(i); // expected output = 0
    }

    /*public static void boooleanTest(){

        boolean b = true;
        b++;
        System.out.println(b);
    }*/

    public static void asciiValueCheck(){

        int ch = 'A';
        System.out.println(ch++); // expected output = 65

        char ch1 = 'A';
        System.out.println(++ch1); // B
    }


    public static void main(String[] args) {
        incrementTest1();
        incrementTest2();
        incrementTest3();
        asciiValueCheck();

    }
}
