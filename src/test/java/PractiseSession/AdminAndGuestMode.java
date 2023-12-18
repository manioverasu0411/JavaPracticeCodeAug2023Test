package PractiseSession;

import java.util.Scanner;

public class AdminAndGuestMode {
    public static void main(String[] args) {
        String adminFlag = "--admin";
        String guestFlag = "--guest";
        Scanner sc = new Scanner(System.in);
        System.out.println("Select either admin or Guest Mode ");
        String inputArguements = sc.next();

        if (inputArguements.contains(adminFlag)) {
            System.out.println("Hello Admin");
        } else if (inputArguements.contains(guestFlag)) {
            System.out.println("Hello guest");

        }

    }
}
