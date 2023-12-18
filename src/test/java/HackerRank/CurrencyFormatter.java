package HackerRank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us_format = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ind_format = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat china_format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fran_format = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "+us_format.format(payment));
        System.out.println("India: "+ind_format.format(payment));
        System.out.println("China: " +china_format.format(payment));
        System.out.println("France: " +fran_format.format(payment));






    }
}
