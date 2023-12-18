package HackerRank;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        /*int i = 12;
        double d = 4.0;
        String s = "is the best place to learn and practice coding!";

        16
        8.0
        HackerRank is the best place to learn and practice coding!

        */

        int num = 4;
        double dou =4.0;
        String str = "HackerRank";

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println(num+i);
        System.out.println(dou+d);
        System.out.println(str+s);

        System.out.println();

    }
}
