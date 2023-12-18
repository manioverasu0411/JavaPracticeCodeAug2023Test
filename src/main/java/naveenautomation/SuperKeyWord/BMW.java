package naveenautomation.SuperKeyWord;

// super keyword only one construction calling for child class

public class BMW extends Car{
   int speed = 200;

    public BMW(){
        super(20);
        System.out.println("BMW Constructor");
    }


    @Override
    public void displayInfo(){
        System.out.println("BMW Info");
    }



    public void displayBMWInfo(){
        System.out.println("BMW System Info");
        System.out.println(speed+super.speed);
        displayInfo();
        super.displayInfo();
    }




}
