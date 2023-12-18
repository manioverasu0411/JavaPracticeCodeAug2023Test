package naveenautomation.OOp_Inheritance;

public class CarTest {
    public static void main(String[] args) {

        BMW b = new BMW();
        b.start();  // overridden method
        b.speed(); // own method
        b.refuel(); // inherit method
        b.stop(); // inhertit method

    }
}
