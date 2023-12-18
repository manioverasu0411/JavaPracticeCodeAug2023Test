package EdurekaAssignment;

/**
 * byte, short, int, long, float, double, char
 * arithmetic operations Add, subtraction,multi, divsion, increment, decrement
 */

public class DataTypesArithmetic {

    static void dataTypes(){
        byte b = Byte.MIN_VALUE;
        short s = Short.MIN_VALUE;
        int i = Integer.MIN_VALUE;
        long l = Long.MIN_VALUE;
        float f = Float.MIN_VALUE;
        double d = Double.MIN_VALUE;
        char c = Character.MIN_VALUE;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println("-----------------------");
    }

    static void arithmeticOperation(){

        int a = 20, b = 10;
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int p_inc = a++;
        int pre_inc = --a;
        int dec = b--;
        int pre_dec = --b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println("-----------------------");
        System.out.println(p_inc);
        System.out.println(pre_inc);
        System.out.println("-----------------------");
        System.out.println(dec);
        System.out.println(pre_dec);
        System.out.println("-----------------------");

    }


    public static void main(String[] args) {
        dataTypes();
        arithmeticOperation();

    }
}
