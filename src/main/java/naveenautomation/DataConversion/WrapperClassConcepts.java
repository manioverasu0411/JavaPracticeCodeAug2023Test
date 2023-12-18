package naveenautomation.DataConversion;

public class WrapperClassConcepts {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x+20);   // 10020

        // String to int conversion using wrapper class
        System.out.println(Integer.parseInt(x)+20);

        // String to double
        String y = "12.33";
        System.out.println(Double.parseDouble(y)+100);

        //String to boolean
        String flag = "true";
        if(Boolean.parseBoolean(flag)){
            System.out.println("Run Testcase in aws");
        }else {
            System.out.println("Run testcase in local");
        }

        // int to String conversion
        int age = 10;
        System.out.println(String.valueOf(age)+" is my current age");
        System.out.println(String.valueOf(age)+10);

        String a = "100Test";
        int b = Integer.parseInt(a);
        System.out.println(b+20);











    }
}
