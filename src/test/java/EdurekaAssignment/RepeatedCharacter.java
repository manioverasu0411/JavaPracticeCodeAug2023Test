package EdurekaAssignment;

import java.util.Scanner;

public class RepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.nextLine();
        System.out.println("Enter the number");
        int n = sc.nextInt();


        int len = s.length();
        System.out.println(len);

        int count = 0;
        for(int i = 0; i<len; i++){
            if(s.charAt(i)=='a')
                count++;

        }



    }
}
