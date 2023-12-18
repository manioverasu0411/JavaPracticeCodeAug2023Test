package InterviewProgrames;

import org.testng.annotations.Test;

public class Qn_004_MissingNumber_Array {

    /**
     * Logic is given sequence to add 1,2,4,5 = 12
     * original sequence to add = 1,2,3,4,5 = 15
     * original sequence - given sequence  = 15-12
     */

    @Test
    public void missingNumber(){
        int[] num = {1,2,3,4,5,6,7,9,0};
        int n = num.length;
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum+=num[i];
        }
        System.out.println(sum);

        int updated_num = n*(n+1)/2;
        System.out.println("updated number is "+updated_num);

        int missing_num = updated_num-sum;
        System.out.println(missing_num);
    }

    public static void main(String[] args) {

        int[] a = {1,2,4,5};
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println(sum);

        int sum1 = 0;
        for(int i = 1; i<=5;i++){   // To add complete sequence so starts with 1
            sum1+=i;
        }
        System.out.println(sum1);

        int missing_number = sum1 - sum;
        System.out.println(missing_number);

    }




}
