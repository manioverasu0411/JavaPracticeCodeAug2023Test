package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class LoopExcercise1 {

    @Test
    public static void printBatManUsingForLoop(){
        for(int i = 1; i<=5; i++){
            System.out.println("For -> I am Batman");
        }
    }

    @Test
    public static void printUsingWhileLoop(){
        int i = 1;
        while(i<=5){
            System.out.println("While -> I am Batman");
            i++;
        }
    }

    @Test
    public static void usingDoWhile(){
        int i = 1;
        do{
            System.out.println("Do While -> I am Batman");
            i++;
        }
        while(i<=5);
    }

    public static void main(String[] args) {
        printBatManUsingForLoop();
        printUsingWhileLoop();
        usingDoWhile();
    }


}
