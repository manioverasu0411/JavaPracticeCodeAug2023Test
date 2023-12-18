package naveenautomation.SessionNotes;

import org.testng.annotations.Test;

public class ForLoopsDemoTest {

    @Test
    public static void printOddAndEvenNumber(){
        for(int i = 1; i<=50; i++){
            if(i % 2 == 0){
                System.out.println(i+" is EvenNumber");
            }else {
                System.out.println(i+" OddNumber");
            }
        }
    }


    @Test
    public static void doWhileTest(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }


    @Test
    public void printTenToOne(){

        int i = 10;
        while (i>=1){
            System.out.println(i);
            i--;
        }

    }


    @Test
    public void reverseString(){

        String name = "Manikandan";
        String rev = "";
        char[] nameChar = name.toCharArray();
        for(int i = nameChar.length-1; i>=0; i--){
            rev = rev+nameChar[i];
        }

        System.out.println(rev);
    }

}
