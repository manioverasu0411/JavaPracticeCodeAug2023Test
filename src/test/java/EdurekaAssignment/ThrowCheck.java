package EdurekaAssignment;

import java.util.Scanner;

public class ThrowCheck {

    class Calculator {

        public int divnum(int x, int y){
            if(y==0){
                throw  new ArithmeticException("Cannot divide number by 0");
            }
            int z = x /y;
            return z;

        }

    }

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1st no");
            int x = sc.nextInt();

            System.out.println("Enter 2nd number");
            int y = sc.nextInt();

            Calculator cal = new Calculator();
            try{
                System.out.println(cal.divnum(x,y));

            }catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }



    }
}
