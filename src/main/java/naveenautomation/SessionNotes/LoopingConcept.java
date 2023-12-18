package naveenautomation.SessionNotes;

import org.testng.annotations.Test;

public class LoopingConcept {

    @Test
    public static void printFirstTenNumbers(){
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    @Test
    public static void printEvenNumbers(){
        int i = 2;
        while(i<=10){
            System.out.println(i);
            i = i+2;
        }
    }

    // we can user break in loops and switch statement

    @Test
    public static void printfiftyNumbers(){
        int i = 1;
        while(i<=50){
           // System.out.println(i);
            if(i % 5 ==0 ){
                System.out.println("Hello 5s family, Welcomes you all "+i);
            }
            i++;
        }
    }


    @Test
    public static void printUsingForLoop(){
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    @Test
    public void printAsciiTable(){
        for(char ch = 'a';ch<='z'; ch++){
            System.out.println(ch+" ="+((byte)ch-96));
        }
    }




    public static void main(String[] args) {


    }
}
