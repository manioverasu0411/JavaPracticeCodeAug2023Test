package HackerRank;

import java.util.Scanner;

public class IndexCalculation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int words= s.nextInt();

        for(int i = 0; i<words;i++)
        {
            String s1 = s.next();
            String even = "" ;
            String odd = "";

            for(int j = 0; j<s1.length();j++){
                if(j%2==0){
                    even = even+s1.charAt(j);
                }else {
                    odd = odd+s1.charAt(j);
                }

            }

            System.out.println(even + " " +odd);
        }

        s.close();



    }
}
