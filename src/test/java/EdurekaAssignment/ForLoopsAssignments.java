package EdurekaAssignment;

import org.testng.annotations.Test;

public class ForLoopsAssignments {

    static void evenAndOddNumbers(){

        for(int i = 1 ; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("****************");

        for(int j = 1 ; j<=20; j++){
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }

    @Test
    static void factorialCheck(){
        int num = 5;
        int n = num; int fact = 1;
        for(int i = n; i>1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    @Test
    static void generateTable(){
        int num = 10;
        for (int i = 1; i<=num; i++){
            System.out.println(i+" X "+ num +" = "+num*i);
        }

    }

    static void addDigitsOfNumber(){
        int num = 12345;
        int total = 0;
        for(;num>0;){
            int rem = num%10;
            total+=rem;
            num = num/10;
        }

       System.out.println(total);
    }

    static void reverseInteger(){
        int num = 12345; int reverse = 0;
        for(;num>0;){
          int rem = num%10;
          reverse = reverse*10+rem;
          num = num/10;
        }
        System.out.println(reverse);
    }

    @Test
    static void fibonocciCheck(){
        // Write a program to generate 10 Fibonacci numbers

        int n1 = 0, n2 = 1 ; int sum = 0;
        for(int i = 2; i<10; i++){
            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }

    }


    public static void main(String[] args) {
        evenAndOddNumbers();
        factorialCheck();
        generateTable();
        addDigitsOfNumber();
        reverseInteger();
        fibonocciCheck();


    }
}
