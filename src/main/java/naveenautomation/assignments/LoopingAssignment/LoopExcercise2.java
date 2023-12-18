package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class LoopExcercise2 {

    @Test
    public static void usingForLoop(){
        for(int i = 1; i<=9; i++){
            System.out.println("For -> I am Batman "+i);
        }
    }

    @Test
    public static void usingWhileLoop(){
        int i = 1;
        while(i<=9){
            System.out.println("While ->I am Batman "+i);
            i++;
        }
    }

    @Test
    public static void usingDoWhile(){
        int i = 1;
        do{
            System.out.println("Do While ->I am Batman "+i);
            i++;
        }while (i<=9);
    }




    public static void main(String[] args) {
        usingForLoop();
        usingWhileLoop();
        usingDoWhile();

    }
}
