package naveenautomation.SessionNotes;

import java.util.Arrays;

public class ArrayConcepts {

    public static void main(String[] args) {

        int i[] = new int[3];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;

        System.out.println(i[2]);

        // fetching all the values from array without using loop

        System.out.println(Arrays.toString(i));

        // using loop

        for (int j = 0; j<=i.length-1; j++){
            System.out.print(i[j]+" ");

        }



    }
}
