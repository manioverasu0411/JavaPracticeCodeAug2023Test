package InterviewProgrames;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicateRemove {
    static void StringDuplicate(String name) {
        char[] nameArray = name.toCharArray();
        Set<Character> hs = new HashSet<>();
        for (char n : nameArray) {
            if (hs.add(n)) {
                System.out.print(n+" ");
            }
        }
    }

    static void usingForLoop(String name){
        char[] nameArray = name.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<nameArray.length; i++){
            boolean status = false;
            for(int j = i+1; j<nameArray.length; j++){
                if(nameArray[i]==nameArray[j]){
                    status = true;
                    break;
                }
            }
            if(!status){
                builder.append(nameArray[i]);
            }
        }
        System.out.println(builder);
    }


    public static void main(String[] args) {

       // StringDuplicate("maniiiaam");
        usingForLoop("maniiiaam");


    }


}
