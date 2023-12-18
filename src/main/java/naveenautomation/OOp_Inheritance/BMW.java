package naveenautomation.OOp_Inheritance;

public class BMW extends Car {

    @Override
    public void refuel() {
        super.refuel();
    }

    public void start(){
        System.out.println("BMW - Start");
    }

    public void speed(){
        System.out.println("BMW - Speed");
    }

}
