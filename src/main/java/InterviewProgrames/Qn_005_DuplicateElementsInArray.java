package InterviewProgrames;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Qn_005_DuplicateElementsInArray {

    /**
     * using nested for loop to find the duplicate values
     * 2nd approach is using hashset to find the duplicate value
     * Using hash map we can find duplicate
     */

    @Test
    public void usingNestedForLoop(){

        String a[] = {"Java","Python","Java","C","C++"};
        for(int i = 0; i<=a.length; i++){
            for(int j = i+1; j<a.length;j++){
                if(a[i].equals(a[j])){
                    System.out.println("Duplicate value is :"+a[i]);
                }
            }
        }

    }

    @Test
    public void usingHashSet(){
        String courses[] = {"Java","Python","Java","C","C++","C"};
        Set<String> lang = new HashSet<>();
        for (String course:courses) {
            if(!lang.add(course)){
                System.out.println(course);
            }
        }
    }

    @Test
    public void usingHashMap(){

        String courses[] = {"Java","Python","Java","C","C++","C"};

        Map<String, Integer> hm = new HashMap<>();

        for (String course:courses) {
            Integer count = hm.get(course);
            if(count == null){
                hm.put(course,1);
            }
            else {
                hm.put(course,++count);
            }
        }


    }



}
