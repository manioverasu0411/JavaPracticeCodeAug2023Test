package InterviewProgrames;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Qn_012_Sorting_Inbuild_methods {

    @Test
    public static void parallelSort(){

        int a[] = {11,10,20,30,70,90,15,22,7,8};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After Sorting: "+ Arrays.toString(a));
    }

    @Test
    public static void sortingMethod(){
        int a[] = {11,10,20,30,70,90,15,22,7,8};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting: "+ Arrays.toString(a));

    }

    @Test
    public static void DecendingOrderSort(){
        Integer a[] = {11,10,20,30,70,90,15,22,7,8};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());    // Collection.reverse order using primitive data type using (Integer)
        System.out.println("After Sorting: "+ Arrays.toString(a));

    }


    public static void main(String[] args) {

    }
}
