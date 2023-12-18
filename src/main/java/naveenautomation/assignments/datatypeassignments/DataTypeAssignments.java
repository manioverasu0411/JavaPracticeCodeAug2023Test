package naveenautomation.assignments.datatypeassignments;

public class DataTypeAssignments {

    public static void addTwoStrings() {
        String a = "Hello";
        String b = "Naveen K";
        System.out.println(a + " " + b);
    }

    public static void sumOfTwoNumbers() {
        int a = 74;
        int b = 36;
        System.out.println(a + b);
    }

    public static void divsionOfTwoNumbers() {
        int a = 50;
        int b = 3;
        System.out.println(a / b);
    }

    public static void computeExpressionValues() {
        Double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }

    public static void concatenateWithString() {
        String name = "Hello Selenium";
        char word = 't';
        // converting char into String using empty string
        String n = "" + word;
        System.out.println(name + " " + n);

    }

    public static void concatenteMultipleString() {
        int a = 100, b = 200, c = 3400;
        System.out.println("Your Total amount is." + " " + (a + b + c) + ".");
    }

    public static void printAsciiValue() {
        char i = 'h';
        System.out.println((int) i);
    }

    public static void printMultipleAsciiValues() {
        int i = 3;
        char j = 'd';
        System.out.println((int) j);
        System.out.println((int) j + i);
    }

    public static void squareOfNumber(){
        double i = 3.9;
        System.out.println(i*i);
    }


    public static void main(String[] args) {
        addTwoStrings();
        sumOfTwoNumbers();
        divsionOfTwoNumbers();
        computeExpressionValues();
        concatenateWithString();
        concatenteMultipleString();
        printAsciiValue();
        printMultipleAsciiValues();
        squareOfNumber();

    }
}
