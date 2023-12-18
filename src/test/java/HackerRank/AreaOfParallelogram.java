package HackerRank;

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int B = scanner.nextInt();
            int H = scanner.nextInt();
            if(B>0 && H > 0){
                int area = B*H;
                System.out.println(area);
            }else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }}


