package InterviewProgrames;

public class Qn_003_ReverseInterger {

    /**
     * Using algoritham
     *
     */

    public static void main(String[] args) {

        int number = 123456789;
        int rev = 0;
        while(number!=0){
            int rem = number%10;
            rev = rev*10+rem; //9 8
            number = number/10; //1234567
        }
        System.out.println(rev);


        // Using String buffer

        int id = 12345;
        StringBuffer buffer = new StringBuffer();
        StringBuffer emp_id = buffer.append(id).reverse();
        System.out.println(emp_id);

        int sal = 98765421;
        int r = 0;
        for(;sal!=0;){
            r =r*10+sal%10;
            sal = sal/10;
        }
        System.out.println(r);

    }




}
