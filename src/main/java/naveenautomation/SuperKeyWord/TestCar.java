package naveenautomation.SuperKeyWord;

/**
 * -- super keyword --
 * In the child class constructor .but it should be the 1st statement only
 * When we can have same properties, that time if we want to call parent class construction
 * or accessing parent class we can use super keyword
 *
 * -- this keyword --
 * Used to call current class constructor
 * always used in 1st statement in constructor
 * To Initialise instance variable with local variable this.a = a
 * can return this keyword in method
 */

public class TestCar {


    public static void main(String[] args) {
        BMW b = new BMW();
        b.displayBMWInfo();

        System.out.println("***************");
        Car c = new Car(4);

    }




}
