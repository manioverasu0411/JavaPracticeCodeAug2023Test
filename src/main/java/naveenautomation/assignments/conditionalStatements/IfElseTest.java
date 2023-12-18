package naveenautomation.assignments.conditionalStatements;

import org.testng.annotations.Test;

public class IfElseTest {

    public static void largestNumber() {

        int a = 105, b = 106, c = 820, d = 97;

        if (a > b && a > c && a > d) {
            System.out.println(a + " : a is the largest number");
        } else if (b > a && b > c && b > d) {
            System.out.println(b + " : b is the largest number");
        } else if (c > a && c > b && c > d) {
            System.out.println(c + " : c is the largest number");
        } else {
            System.out.println(d + " : d is the largest number");
        }
    }

    public static void positiveNegativeNumber(int a) {

        if (a < 0) {
            System.out.println("it is negative number");
        } else {
            System.out.println("it is positive number");
        }

    }


    public static void oddOrEven(int a){

        if(a%2==0){
            System.out.println("it is EvenNumber");
        }else {
            System.out.println("it is Odd Number");
        }
    }


    public static void main(String[] args) {
        largestNumber();
        positiveNegativeNumber(0);
        oddOrEven(0);

    }
}
