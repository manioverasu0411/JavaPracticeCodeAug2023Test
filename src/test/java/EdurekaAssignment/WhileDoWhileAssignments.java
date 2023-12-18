package EdurekaAssignment;

import org.testng.annotations.Test;

public class WhileDoWhileAssignments {

    @Test
    static void evenAndOddNumbers(){
        int i = 1;
        while(i<10){
            System.out.print(i);
            i = i+2;
        }

    }

    static void factorialCheck(){
        int num = 5;
        int i = 1; int fact = 1;
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println(fact);

    }

    @Test
    static void generateTable(){

        int num = 10; int i = 1;
        while (i<=10){
            System.out.println(i+" X "+ num +" = "+num*i);
            i++;
        }

    }


    static void addDigitsOfNumber(){
        int num = 12345; int total = 0;
        while(num>0){
            int rem = num%10;
            total+=rem;
            num =num/10;
        }
        System.out.println(total);
    }

    @Test
    static void reverseNumber(){
        int num = 12345; int reverse = 0;
        while (num>0){
            int rem = num%10;
            reverse = reverse*10+rem;
            num = num/10;
        }
        System.out.println(reverse);

    }

    @Test
    static void fibonocciCheck(){
        int n1 = 0, n2 = 1 ; int sum = 0;
        int i = 2;

        while(i<10){
            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
            i++;
        }

    }


    public static void main(String[] args) {

        evenAndOddNumbers();
        factorialCheck();
        generateTable();
        addDigitsOfNumber();
        reverseNumber();
        fibonocciCheck();

    }

}
