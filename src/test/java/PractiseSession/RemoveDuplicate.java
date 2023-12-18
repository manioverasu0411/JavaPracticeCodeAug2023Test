package PractiseSession;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String name = "Java code Java";
        String[] nameArray = name.split(" ");
        String targetString = "";

        HashSet<String> hs = new LinkedHashSet<>();
        for (String n:nameArray) {
            if(!hs.add(n)){
                System.out.println(n);
                targetString = n;
            }

            for(int i = targetString.length()-1; i>=0 ; i--){
                System.out.print(targetString.charAt(i));
            }

        }




    }
}
