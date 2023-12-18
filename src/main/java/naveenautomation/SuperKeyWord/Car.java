package naveenautomation.SuperKeyWord;

public class Car {

    int speed = 100;

    public Car(){
        System.out.println("Car Constructor....");
    }

    public Car(int a){
        this(3,6);
        System.out.println("Car Constructor: "+a);
    }

    public Car(int a, int b){
        System.out.println("Car Constructor: "+(a+b));
    }

    public void displayInfo(){
        System.out.println("Car Info");
    }

}
