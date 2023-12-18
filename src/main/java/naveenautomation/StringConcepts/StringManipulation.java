package naveenautomation.StringConcepts;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {

        /**
         * String is collection of multiple characters
         *
         */

        String str = "Hello Hi This is my java code and i am so happy";
        System.out.println(str.length());
        System.out.println("LI is: "+ 0 ); // 0
        System.out.println("HI is: "+ (str.length()-1));  // 40
        System.out.println(str.charAt(0)); // H
       //  System.out.println(str.charAt(41)); StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()-1));  // y

        System.out.println(str.indexOf("H"));
        System.out.println(str.indexOf("i"));

        // Need to find second occurrence of i
        System.out.println(str.indexOf("i",2));   // 2 is hardcoded value

        // without hardcoding the value

        System.out.println("--------------");
        String str1 = "Hi This is my java code and i am so happy";
        System.out.println(str1.indexOf("i",str1.indexOf("i")+1)); // i in 2nd occurrence
        System.out.println(str1.indexOf("i",str1.indexOf("i",str1.indexOf("i")+1)+1));  // 3rd occurrence of i
        System.out.println(str1.indexOf("i",str1.indexOf("i",str1.indexOf("i",str1.indexOf("i")+1)+1)+1));
        System.out.println("--------------");


        System.out.println(str1.indexOf("i",str1.indexOf("i")+7)); // i in 3rd occurrence

        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf("Mani")); // if string index not present (-1) will be displayed

        // Example in selenium

        String msge = "Hello Adminsfasdf";
        if(msge.indexOf("Admin")!= -1){
            System.out.println("Admin word is presented");
        }else {
            System.out.println("Admin not presented");
        }


        // trim

        String name = "  Mani Overasu   ";
        System.out.println(name.trim());

        // replace
        String dob = "04-11-1990";   // expected 04/11/1990
        System.out.println(dob.replace("-","/"));

        // sub string method
        String loop = "your order id is 1234";  // Expected to fetch 1234
        System.out.println(loop.substring(17));
        System.out.println(loop.substring(17,loop.length()));
        System.out.println(loop.substring(loop.indexOf("is")+3,loop.length()));

        // split

        String lang = "JAVA_PYTHON_RUBY_JS";
        String[] lg = lang.split("_");
        System.out.println(lg[0]);
        System.out.println(Arrays.toString(lg));
        System.out.println("**************");

        String pop = "NaveenxXHelloSeleniumxXXTestxXXAutomation";
        String[] t = pop.split("xX");
        System.out.println(t[0]);
        System.out.println("**************");

        System.out.println(Arrays.toString(t));






    }
}
