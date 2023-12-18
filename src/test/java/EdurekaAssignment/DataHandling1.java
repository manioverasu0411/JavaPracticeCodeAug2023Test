package EdurekaAssignment;

import java.util.Scanner;

public class DataHandling1 {

    static void display() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employee");
        int empCount = sc.nextInt();

        int[] ids = new int[empCount];
        String[] names = new String[empCount];
        int[] salaries = new int[empCount];

        for (int i = 0; i < empCount; i++) {
            System.out.println("Enter the Emp id");
            ids[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Name of Emp");
            names[i] = sc.nextLine();
            System.out.println("Enter the salary");
            salaries[i] = sc.nextInt();
        }

        System.out.printf("---------------------------------%n");
        System.out.printf("   EMPLOYEE DETAILS  %n");
        System.out.printf("---------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |", "EMP ID", "NAME", "SALARY");
        System.out.println();
        System.out.printf("---------------------------------%n");

        for (int i = 0; i < empCount; i++) {
            System.out.printf("| %-10s", String.valueOf(ids[i]));
            System.out.printf("| %-8s", names[i]);
            System.out.printf("| %-4s", String.valueOf(salaries[i]));
            System.out.println();


        }

        System.out.printf("---------------------------------%n");

    }


    public static void main(String[] args) {
        display();


    }
}
