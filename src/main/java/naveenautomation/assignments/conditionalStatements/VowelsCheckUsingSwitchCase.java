package naveenautomation.assignments.conditionalStatements;

import java.util.Scanner;

public class VowelsCheckUsingSwitchCase {

    public static void switchCase1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        String ch = scanner.next();

        switch (ch) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");
                break;
        }
    }

    public static void usingCharcter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        Character operator = scanner.next().charAt(0);

        switch (operator){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(operator+" is vowel");
                break;
            default:
                System.out.println(operator+" is consonant");
        }

    }


    public static void main(String[] args) {
        //'switchCase1();
        usingCharcter();
    }

}
