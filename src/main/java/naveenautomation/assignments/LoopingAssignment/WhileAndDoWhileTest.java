package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class WhileAndDoWhileTest {

    @Test
    public static void printUsingWhile(){
        int i = 10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }

    @Test
    public static void printDoWhile(){
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while (i>=1);
    }


    @Test
    public static void testWhileLoop(){
        int i = 1;

        while (i<=10){
            System.out.println("Hello world "+i);
            i++;
        }
    }

    public static void main(String[] args) {

    }
}
