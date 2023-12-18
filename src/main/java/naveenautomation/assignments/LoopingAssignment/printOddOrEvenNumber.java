package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class printOddOrEvenNumber {

    @Test
    public static void testPrograme(){
        int i = 1;
        while(i<=1){
            System.out.println("Hi Java");

        }
    }

    public static void main(String[] args) {

        for(int i = 1; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i+" its even number");
            }else {
                System.out.println(i+" its Odd Number");
            }
        }

    }
}
