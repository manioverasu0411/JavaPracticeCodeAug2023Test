package PractiseSession;

import java.util.Scanner;

public class CustomerStatus {
    public static void main(String[] args) {

        // 4 type of customer status - > premium, guest,regular,doesn't have status

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select any one of the customer type: 1 - Regular, 2 - Guest, 3 - Premium Cuestomer");
        String Customer_Status = sc.next();

        switch (Customer_Status) {
            case "Regular":{
                System.out.println("Thankyou for the order");
            }
            case "Guest" : {
                System.out.println("You are guest customer, Please create account for regualr customer to get minimum offer");
            }
            case "Premium" : {
                System.out.println("You are premium customer, you will get 15 OFF for all the orders");
            }
            default :
                System.out.println("Please select valid customer status");
        }
    }


}
