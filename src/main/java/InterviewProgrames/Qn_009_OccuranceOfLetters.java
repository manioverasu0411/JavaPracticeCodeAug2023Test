package InterviewProgrames;

import org.testng.annotations.Test;

import java.util.*;

public class Qn_009_OccuranceOfLetters {

    public static  void getCharCount(String name){

         char[] charName = name.toCharArray();
         HashMap<Character,Integer> hm = new HashMap<>();
        for (char n:charName) {
            if(!hm.containsKey(n)){
                hm.put(n,1);
            }else {
                hm.put(n,hm.get(n)+1);
            }

        }
        System.out.println(name+" : "+hm);
    }


    public static void FindDuplicateElementsInArray(){
        String[] names = {"Mani","Vini","Venba","Vini"};
        HashSet<String> hs = new HashSet<>();

        for (String name :names) {
            if(!hs.add(name)){
                System.out.println("Duplicate Value is:"+name);
                break;
            }
            }

        }

        public static void FindLargestValue(){
        int num[] = {-10,25,2566,10000};
        int largest = num[0];
        int smallest = num[0];

        for(int i = 0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }else if(num[i]<smallest){
                smallest = num[i];
            }
        }

            System.out.println("Largest value is: "+largest);
            System.out.println("Largest value is: "+smallest);

        }

        @Test
        public static void MissingNumber(){
            int a[] = {1,2,3,4,5,7};     // 58 is missing.
            int sum = 0;
            int sum1 = 0;
            int arrLen = a.length;            // length of integer array.
            for (int i = 0; i < arrLen; i++) {
                sum += a[i];
                // similar to :- sum = sum + a[i];
            }
            System.out.println("sum =" + sum);

            for (int j = a[0]; j <= a[arrLen -1]; j++) {
                sum1 += j;
                // similar to :- sum1 = sum1 + j;
            }
            System.out.println("sum1 = " + sum1);

// Print the missing number :
            System.out.println("Missing Number = " + (sum1 - sum));

    }

    @Test
    public  void reverseWord(){

        String str = "Manikandan Overasu Vinita";
        String[] words = str.split(" ");
        String reverseString = "";

        for (String w:words) {
            String reverseWords = "";
            for(int i = w.length()-1; i>=0;i--){
                reverseWords+=w.charAt(i);
            }
          reverseString+=reverseWords+" ";
        }

        System.out.println(reverseString);

    }




    public static void main(String[] args) {
       // getCharCount("Manikandan");
       // getCharCount("Testing chennai");
       // FindDuplicateElementsInArray();
        FindLargestValue();


    }
}