package InterviewProgrames;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Qn_RemoveDuplicateArrayNumber {


    @Test
    public  void sumOfNumbers(){
        int total = IntStream.rangeClosed(0,50).sum();
        System.out.println(total);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,7,5,1,2,2,3,6,7);
        List<Integer> updateList = new ArrayList<>();

        for (Integer data:list) {
            if(!updateList.contains(data)){
                updateList.add(data);
            }
        }
        System.out.println(updateList);

    }
}
