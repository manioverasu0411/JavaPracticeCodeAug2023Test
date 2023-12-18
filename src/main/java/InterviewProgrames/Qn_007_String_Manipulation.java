package InterviewProgrames;

import java.util.Arrays;

public class Qn_007_String_Manipulation {

    /**
     * if particular index is not available, it should return -1
     *
     */

    public static void main(String[] args) {
        String str = "Manikandan Overasu";
        String str1 = "   manikandan Overasu   ";
        System.out.println("The length of the string is :"+str.length());
        System.out.println("The fifth index of the character is: "+str.charAt(5));
        System.out.println("*****************");
        System.out.println("The index of the n is: "+str.indexOf('n'));  // 1st occurance of n
        System.out.println(str.indexOf("n",str.indexOf('n')+1)); // 2nd occurance of n
        System.out.println("*****************");
        System.out.println(str.indexOf("asu"));

        // invalid index check - should return -1
        System.out.println(str.indexOf("Venba"));

        // String comparision
        System.out.println(str.equals(str1));

        // to ignore cases
        System.out.println(str.equalsIgnoreCase(str1));

        // To get Substring method
        System.out.println(str.substring(4,9));

        // trim
        System.out.println(str1.trim());  // trim only before and after space

        // replace method
        String new_string = str1.replace(" ", "");
        System.out.println(new_string);

        //split method  -> after splitting it has converted into String array
        String test = "Hello_World_Test_Selenium";
        System.out.println(Arrays.toString(test.split("_")));

        String test1[] = test.split("_");
        for(int i = 0; i < test1.length; i++){
            System.out.println(test1[i]);
        }


    }
}
