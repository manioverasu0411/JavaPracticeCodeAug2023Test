package PractiseSession;

import java.util.Arrays;
import java.util.Scanner;

public class splitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.print("You entered these words: ");
        System.out.print(Arrays.toString(userInput.split("_")));
        //
    }
}
