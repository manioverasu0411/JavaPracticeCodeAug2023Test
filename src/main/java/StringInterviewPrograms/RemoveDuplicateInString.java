package StringInterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {

    public static void usingStringBuilder(String name) {

        StringBuilder sb = new StringBuilder();
        name.chars().distinct().forEach(s -> sb.append((char) s));
        System.out.println(sb);
    }

    public static void stringBuildApproach2(String name){
        StringBuilder sb =  new StringBuilder();
        for(int i = 0; i<name.length(); i++) {
             char ch= name.charAt(i);
              int idx = name.indexOf(ch,i+1);
              if(idx==-1){
                  sb.append(ch);
              }

        }
        System.out.println(sb);

    }


    public static void usingHashSet(String name){
       StringBuilder sb =  new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for(int i = 0; i<name.length(); i++){
            set.add(name.charAt(i));
        }

        for (Character c:set) {
            sb.append(c);

        }

        System.out.println(sb);

    }






    public static void main(String[] args) {

        //usingStringBuilder("Manikandan");
        //stringBuildApproach2("Manikandan");
        usingHashSet("veera");


    }
}
