package naveenautomation.SessionNotes;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConcepts_2 {

    @Test
    public static void indexLooping(){
        String empNames[] = new String[3];
        empNames[0] = "Mani";
        empNames[1] = "Vini";
        empNames[2] = "Venba";

        for(int i = 0; i<=empNames.length-1; i++){
            System.out.println(empNames[i]);
            if(empNames[i].equals("Venba")){
                System.out.println("Promoted into CEO");
                break;
            }
        }

    }

    @Test
    public static void usingForEachLoop(){
        String empNames[] = new String[3];
        empNames[0] = "Mani";
        empNames[1] = "Vini";
        empNames[2] = "Venba";

        for (String name:empNames) {
            System.out.println(name);
            if(name.equals("Mani")){
                System.out.println("He is good boy");
                break;
            }
        }
    }

    @Test
    public static void usingLambda(){
        String empNames[] = new String[3];
        empNames[0] = "Mani";
        empNames[1] = "Vini";
        empNames[2] = "Venba";
        System.out.println(Arrays.stream(empNames).filter(s -> s.contains("Mani")).collect(Collectors.toList()));

    }

    @Test
    public static void charLooping(){
        char ch[] =  new char[4];
        // System.out.println((byte)ch[0]);
        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';
        ch[3] = 'd';

        System.out.println(Arrays.toString(ch));

        for (char e:ch) {
            System.out.println((byte)e);

        }

    }

    @Test
    public static void reverseForEachLoop(){

        int data[] = {1,2,3,4,5,6,7,8,9,10};
        int reverse = 0;

        for (int d :data) {
            System.out.println(d);
        }

    }

}
