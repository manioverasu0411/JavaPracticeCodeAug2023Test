package naveenautomation.assignments.conditionalStatements;

import java.util.Scanner;

public class CarBookingUsingSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select Car Type: Mini, Sedan, SUV, Premium");
        String car = scanner.next().toLowerCase();

        switch (car)
        {
            case "mini":
            case "sedan":
            case "suv":
            case "premium":
                System.out.println("Waiting for booking: "+car+" Car");
                break;
            default:
                System.out.println("please select the right car type");
                break;
        }

    }
}
