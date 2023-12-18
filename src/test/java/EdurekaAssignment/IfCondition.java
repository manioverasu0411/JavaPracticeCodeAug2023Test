package EdurekaAssignment;

import java.util.Scanner;

public class IfCondition {

    static void eligibleVoting(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for Voting");
        }else {
            System.out.println("Not Eligible for Voting");
        }
    }

    static void positiveOrNegativeCheck1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }

    static void positiveOrNegativeCheck2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else {
            System.out.println("Given Number is Zero");
    }

    }

    static void largestNumberOfTwo(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = sc.nextInt();

        if(number1>number2){
            System.out.println(number1+" is greatest number");
        }else {
            System.out.println(number2+" is greatest number");
        }

    }

    static void oddOrEven(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is odd");
        }

    }


    public static void main(String[] args) {
        eligibleVoting();
        positiveOrNegativeCheck1();
        positiveOrNegativeCheck2();
        largestNumberOfTwo();
        oddOrEven();

    }
}
