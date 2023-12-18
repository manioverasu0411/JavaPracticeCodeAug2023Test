package InterviewProgrames;

import java.util.HashMap;
import java.util.Map;

class Qn_002_Remove_Junk_character {

    /**
     * Regular expression have to use for removing junk character
     * Regular expression is [a-zA-Z0-9]
     */

    public static void removeWhiteSpace(){
        String name = "Manikandan %^%*&%^* Overasu";
        String junk = name.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(junk);

        String empName = "Vinitha    venba    manikandan           chennai  medavakkam";
        String removeSpace = empName.replaceAll("\\s","");
        System.out.println(removeSpace);
    }

    public static void occuranceOfLetter(String name){

        char[] charName = name.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (char n:charName) {
            if(n==' ')
                continue;
            if(!hm.containsKey(n)){
                hm.put(n,1);
            }else {
                hm.put(n,hm.get(n)+1);
            }

        }

        System.out.println("The occurrence of letter count is: "+hm);


    }


    public static void main(String[] args) {

        //removeWhiteSpace();
        occuranceOfLetter("Manikandan Overasu");


    }
}
