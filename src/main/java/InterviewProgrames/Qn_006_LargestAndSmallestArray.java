package InterviewProgrames;

import java.util.Arrays;

public class Qn_006_LargestAndSmallestArray {

    /**
     * 1st assign largest and smallest variable as a[0] and a[0]
     * then iterate using for loop
     */

    public static void main(String[] args) {

        int a[] = {10,-20,50,1000,250,1};
        int largest = a[0];
        int smallest = a[0];

        for(int i = 1; i< a.length;i++){
            if(a[i]>largest){
                largest = a[i];
            }else if (a[i]<smallest){
                smallest = a[i];
            }
        }

        System.out.println("The given array is: "+ Arrays.toString(a));
        System.out.println("The largest number is: "+largest);
        System.out.println("The smallest number is: "+smallest);
    }




}
