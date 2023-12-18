package RahulSeleniumAssignment;

import org.testng.annotations.Test;

public class TestCheck {


    @Test
    public static void stringFormatcheck(String word){

        //String word = "5 + 4 = ";
        String[] splitWord = word.split("\\s");
        int a =Integer.parseInt(splitWord[0]);
        int b = Integer.parseInt(splitWord[2]);

        String symbol = splitWord[1];

        if(symbol.equals("+")){
            System.out.println(a+b);
        }else if(symbol.equals("-")){
            System.out.println(a-b);
        } else if (symbol.equals("*")) {
            System.out.println(a*b);
        }else {
            System.out.println(a/b);
        }
    }

    public static void main(String[] args)  {

        stringFormatcheck("5 + 3 =");
        stringFormatcheck("5 - 3 =");
        stringFormatcheck("5 * 3 =");
        stringFormatcheck("5 / 3 =");

    }




}
