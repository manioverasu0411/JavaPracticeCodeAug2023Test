package naveenautomation.assignments.LoopingAssignment;

import org.testng.annotations.Test;

public class AsciiNumberPrint {

    @Test
    public static void usingUpperCase(){
        for(char ch = 'A'; ch<='Z';ch++){
            System.out.println(ch+" "+(byte)ch);
        }
    }

    @Test
    public static void usingLowerCase(){
        for(char ch = 'a'; ch<='z';ch++){
            System.out.println((byte)ch+" "+ch);
        }
    }

    @Test
    public static void usingTest(){
        for (char ch = 0; ch<=9; ch++){
            System.out.println((byte)ch +48+" "+(int)ch);
        }
    }


    @Test
    public static void printZeroToNine(){

        for (char ch = '0' ; ch<='9'; ch++){
            System.out.println((byte)ch+" "+ch);
        }

    }
}
