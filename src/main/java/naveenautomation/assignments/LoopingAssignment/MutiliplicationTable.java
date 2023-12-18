package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class MutiliplicationTable {

    // 1 * 5 = 5

    @Test
    public static void usingForLoop(){

        for(int i = 1; i<=100; i++){
            System.out.println(i + " * "+"5"+" = " + i*5);
        }

    }

    @Test
    public static void usingWhileLoop(){
        int i = 1;

        while (i<=100){
            System.out.println(i + " * "+"5"+" = " + i*5);
            i++;
        }
    }

    @Test
    public static void usingDoWhile(){

        int i = 1;
        do{
            System.out.println(i + " * "+"5"+" = " + i*5);
            i++;
        }while (i<=100);


    }

    public static void main(String[] args) {

    }
}
