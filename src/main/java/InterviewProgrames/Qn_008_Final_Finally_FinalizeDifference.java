package InterviewProgrames;

import java.util.Arrays;

public class Qn_008_Final_Finally_FinalizeDifference {

    /**
     * Final Keyword -> No one can change the variable, at the time we have to user final keyword
     * if final is declared -> Nobody can't change that variable
     * used prevent inheritance
     * To prevent method overriding
     * Finally - executed after the try catch block, it is used in exception
     * Finalise -> used to garbage collection - just for the cleanup process for objects
     */

    public static void main(String[] args) {

       final int a = 20; // Constant value -> can not change
        System.out.println(a);
        test_01();

    }

    public static void test_01(){
        int i = 10;

        try {
            System.out.println("Inside try block");
            int k = i/0;
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
