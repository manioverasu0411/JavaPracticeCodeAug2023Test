package InterviewProgrames;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class FourthLargestDepositeString {

    public static void main(String[] args) throws ParseException {

        String BankA = "$151.4B";
        String BankB = "$551.9B";
        String BankC = "$851.6B";
        String BankD = "$351.4B";

        List<Double> amountList = new LinkedList<>();


        String amountA = BankA.replace("$", "").replace("B", "");
       // System.out.println(Double.valueOf(amountA));

        String amountB = BankB.replace("$", "").replace("B", "");
        //System.out.println(Double.valueOf(amountB));

        String amountC = BankC.replace("$", "").replace("B", "");
        //System.out.println(Double.valueOf(amountC));

        String amountD = BankD.replace("$", "").replace("B", "");
        //System.out.println(Double.valueOf(amountD));

        amountList.add(Double.valueOf(amountA));
        amountList.add(Double.valueOf(amountB));
        amountList.add(Double.valueOf(amountC));
        amountList.add(Double.valueOf(amountD));

        System.out.println(amountList);





    }
}
