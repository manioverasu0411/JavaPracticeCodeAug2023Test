package StreamsAndLambda;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new Greeting(){
            @Override
            public void SayHello() {
                System.out.println("Hello");
            }

        };

        greeting.SayHello();

        Greeting greeting2 = () -> System.out.println("Hello world");
        greeting2.SayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x*y+randomNumber;
        };

        System.out.println(calculator.calculate(20,10));

    }
}
