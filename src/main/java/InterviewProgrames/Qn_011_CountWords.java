package InterviewProgrames;

import java.util.Scanner;

public class Qn_011_CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words to be counted ");
        String words = sc.nextLine();

        int count = 1;
        for(int i = 0; i<words.length()-1;i++){
            if((words.charAt(i)==' ') && (words.charAt(i+1)!=' ')){
                count++;

            }
        }
        System.out.println(count);


    }
}
