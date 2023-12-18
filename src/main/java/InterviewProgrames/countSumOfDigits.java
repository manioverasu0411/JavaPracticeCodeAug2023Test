package InterviewProgrames;

public class countSumOfDigits {

    public static void countTotalOfDigits(int num){
        int count = 0;
        while(num>0){
           int rem =  num%10;
                count++;
            num = num/10;
        }
        System.out.println(count);

    }


    public static void countSumOfDigits(int num){

        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum=sum+rem;
            num = num/10;
        }

        System.out.println("The sum of given numbers is: "+sum);

    }

    public static void main(String[] args) {
      // countTotalOfDigits(1245);
        countSumOfDigits(1235);
    }
}
