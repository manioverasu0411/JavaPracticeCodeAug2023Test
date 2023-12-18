package PractiseSession;

public class MethodOverloading {

    /**
     * same method but passing paramenter should be different  -> polymorphism
     *
     */

     static int max(int a, int b){
    return a>b?a:b;
    }

    static double max(double a, double b){
        return a>b?a:b;
    }

    public static void main(String[] args) {

        System.out.println( max(10,20));
        System.out.println( max(10.8,20.9));


    }
}
