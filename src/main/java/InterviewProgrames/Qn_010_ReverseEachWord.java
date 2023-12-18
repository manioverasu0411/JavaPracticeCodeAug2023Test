package InterviewProgrames;

public class Qn_010_ReverseEachWord {
    public static void main(String[] args) {

        String str = "Welcome to Java";
         String[] words = str.split(" ");
         String reverseString = "";

        for (String word:words) {
            String reverseWord ="";
            for(int i = word.length()-1;i>=0;i--)
            {
                reverseWord+=word.charAt(i);
            }

            reverseString+=reverseWord+" ";

        }

        System.out.println(reverseString);


    }
}
