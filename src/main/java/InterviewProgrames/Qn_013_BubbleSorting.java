package InterviewProgrames;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Qn_013_BubbleSorting {
    /**
     * Comparing two numbers and swapping it using nested for loop
     * @param args
     */

    public void  BubbleSort(){
        int[] a = {1,6,4,7,2,5,3};
        int len = a.length;
        System.out.println("Before sorting: "+Arrays.toString(a));

        for(int i = 0; i<len-1;i++) { // No passes
            for(int j=0; j<len-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting: "+Arrays.toString(a));

    }


    @Test
    public static void BubbleSortMani(){
        int[] a = {16,43,12,15,10,9};
        System.out.println("Before sorting: "+Arrays.toString(a));
        int len = a.length;

        for(int i = 0; i<len-1;i++){
            for(int j = 0; j<len-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting: "+Arrays.toString(a));

    }



    public static void main(String[] args) {

        Qn_013_BubbleSorting qn013BubbleSorting = new Qn_013_BubbleSorting();
        qn013BubbleSorting.BubbleSort();


}
}
