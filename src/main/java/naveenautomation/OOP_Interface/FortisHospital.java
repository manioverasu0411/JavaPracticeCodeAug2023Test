package naveenautomation.OOP_Interface;


// child class of Parent Interface
public class FortisHospital implements USMedical,UkMedical,IndianMedical{

   // int min_fee = 50;
    @Override
    public void physioServices() {
        System.out.println("physio Services");
    }

    @Override
    public void gynoServices() {
        System.out.println("gynecologist servicess");
    }

    @Override
    public void orthoServices() {
        System.out.println("Ortho Services");
    }

    @Override
    public void ENTService() {
        System.out.println("ENT service");
    }

    // common method for all 3 interface, business login given by fortis hospital class
    @Override
    public void emergencyServices() {
        System.out.println("Emergency Services");
    }

    @Override
    public void dentalServices() {
        System.out.println("Dental Services ");
    }

    @Override
    public void cardioServices() {
        System.out.println("Cardio services provided");

    }

    @Override
    public void oncologyService() {
        System.out.println("Oncology Services");
    }

    @Override
    public void gastroServices() {
        System.out.println("Gastro Services");
    }

    public void medicalInsurance(){
        System.out.println("Medical Insurance provided");
    }

    public void nursingTraining(){
        System.out.println("Nursing Training provided");
    }

}
