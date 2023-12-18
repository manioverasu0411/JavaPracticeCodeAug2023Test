package naveenautomation.SessionNotes;

import java.util.Arrays;

public class MultiDimensionArrayCheck {
    public static void main(String[] args) {

        int num[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(num)+" ");

        for (int r = 0; r<=num.length; r++){
            for(int c = 0; c<num[0].length; c++){
                System.out.print(num[r][c]+" ");
            }
            System.out.println();
        }


    }
}
