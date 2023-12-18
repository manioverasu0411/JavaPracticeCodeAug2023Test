package EdurekaAssignment;

import java.util.Scanner;

public class votingException {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            String req = "";
        do{
            System.out.println("Enter you age");
            try {
                int age = sc.nextInt();
                if(age>18){
                    System.out.println("Voting done, Eligible for voting");
                }else {
                    throw new ArrayStoreException("Age should be greater than 18");
                }
            }catch (Exception ex){
                System.err.println(ex);
            }
            System.out.println("Anyonw else to vote [y/n]");
            req = sc.next();

        }while (req.equalsIgnoreCase("y"));


    }
}
