package naveenautomation.assignments.conditionalStatements;

import java.util.Scanner;

public class EnvironementChoosing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose any one of the Environment - QA, Stage,Dev,UAT, PROD");
        String browser = scanner.next();

        switch (browser){

            case "QA":
            case "Stage":
            case "Dev":
            case "UAT":
            case "PROD":
                System.out.println("Script Execution Started in: "+browser);
                break;
            default:
                System.out.println("Please select valid Environment");


        }

    }
}
