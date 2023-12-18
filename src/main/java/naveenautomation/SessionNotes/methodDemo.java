package naveenautomation.SessionNotes;

import java.util.ArrayList;


public class methodDemo {

    public ArrayList<String> getNames(){
        String n1 = "Mani";
        String n2 = "Vini";

        ArrayList<String> enames = new ArrayList<String>();
        enames.add(n1);
        enames.add(n2);
        return enames;

    }

    public static void main(String[] args) {

        methodDemo m1 = new methodDemo();
        ArrayList<String> eList = m1.getNames();
        System.out.println(eList.size());
        eList.add("Venba");

        for (String e:eList) {
            System.out.println(e);
        }

    }
}
