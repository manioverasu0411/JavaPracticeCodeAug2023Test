package EdurekaAssignment;

import java.util.Scanner;

public class ExceptionCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter 1st no");
            int x = sc.nextInt();

            System.out.println("Enter 2nd number");
            int y = sc.nextInt();

            int z = x / y;
            System.out.printf("%d / %d = %d \n", x, y, z);
        } catch (ArithmeticException ex) {
            System.out.println(ex);

        }
        finally {
            System.out.println("\n--------finally block--");
            System.out.println("Desinged by Mani");
            System.out.println("Team Man");
            sc.close();
        }
    }}
