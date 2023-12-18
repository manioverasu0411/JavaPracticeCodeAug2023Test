package StringInterviewPrograms;

public class ReverseEachWordInString {

    public static void reverseEachWord(String s){

        String[] names = s.split(" ");
        String reverseWord = "";

        for (String word:names) {
            // System.out.println(word);
            String reverse = "";
            for (int i = word.length()-1; i>=0; i--)
            {
                reverse+=word.charAt(i);
            }
            reverseWord+=reverse+" ";

        }

        System.out.println(reverseWord);


    }

    public static void main(String[] args) {

        reverseEachWord("java code");
    }
}
