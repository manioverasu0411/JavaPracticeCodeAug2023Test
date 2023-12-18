package naveenautomation.assignments.ArrayListAssignments;

import org.testng.annotations.Test;

public class Array_Assignment {

    // print reverse order using foreach loop

    @Test
   public static void usingForLoopReverse(){
       int id[] = {1,2,3,4,5};
       for(int i = id.length-1; i>=0; i--){
           System.out.println(id[i]);
       }
   }

   @Test
   public static void usingForEachLoop(){
       int i[] = {1,2,3,4,5};
       int count = i.length-1;
       for (int e:i) {
           e = count;
           System.out.println(i[e]);
           count--;

       }
    }

}
