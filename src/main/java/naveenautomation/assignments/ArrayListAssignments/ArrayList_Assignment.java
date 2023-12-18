package naveenautomation.assignments.ArrayListAssignments;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Assignment {

    @Test
    public static void addingColors(){

        ArrayList<String> color = new ArrayList<String>();
        color.add("Blue");
        color.add("red");
        color.add("yellow");
        color.add("white");

        System.out.println("Getting value from index of 2 is :"+color.get(2));
        System.out.println("update Value from list"+color.set(1,"Orange"));
        System.out.println("After updating color "+color);
        System.out.println("After Removing color: "+color.remove(3));
        System.out.println(color);

        for (String c:color) {
            System.out.println(c);
            }

        }

        @Test
        public static void searchElementInLoop(){

            ArrayList<String> color = new ArrayList<String>();
            color.add("Blue");
            color.add("red");
            color.add("yellow");
            color.add("white");

            for (String c:color) {
                if(c.equals("red")){
                    System.out.println("Found color: "+c);
                    break;
                }

            }
        }

        @Test
        public static void reverseArrayList(){

            ArrayList<String> color = new ArrayList<String>();
            color.add("Blue");
            color.add("red");
            color.add("yellow");
            color.add("white");

          //  Collections.reverse(color);
          //  System.out.println(color);

            for (int i = color.size()-1; i>=0; i--){
                System.out.print(color.get(i)+" ");
            }

        }

        @Test
        public static void reverseUsingForEach(){
            ArrayList<String> color = new ArrayList<String>();
            color.add("Blue");
            color.add("red");
            color.add("yellow");
            color.add("white");

            int count = color.size()-1;

            for (String c :color) {
                c = String.valueOf(count);
                System.out.println(c);

            }

        }

        @Test
        public static void virtualCapcity(){

            ArrayList<String> color = new ArrayList<String>(20);

            // vc = 20 , pc = 0
            // After the adding the values vc = 16, pc = 4

            color.add("Blue");
            color.add("red");
            color.add("yellow");
            color.add("white");

            color.trimToSize();
            System.out.println(color.size());

        }






    public static void main(String[] args) {

    }
}
