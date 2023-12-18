package naveenautomation.assignments.ArrayListAssignments;

import java.util.Arrays;

public class arrayListTest1 {
    public static void main(String[] args) {

        int p[] = {1,4,5,2,3,22,31, 2};
        int a[] = new int[p.length-1];
        int j = 0;
        for (int i = 0; i<= p.length-1; i++){
                if(p[i] != 22){
                    a[j] = p[i];
                    j++;
            }
        }

        System.out.println(Arrays.toString(a));

    }
}
