package InterviewProgrames;

public class CountOddAndEvenNumber {

    public static void evenAndOddNumber(int a){
        int odd =0;
        int even =0;
        while(a>0){
            int rem = a%10;   // 6
            if(rem%2==0){
                even++;
            }else {
                odd++;
            }
            a = a/10;
        }

        System.out.println("No of Even number is: "+even);
        System.out.println("No of Odd number is: "+odd);

    }

    public static void main(String[] args) {

        evenAndOddNumber(12346);
        evenAndOddNumber(13798);
        evenAndOddNumber(24689);
    }
}
