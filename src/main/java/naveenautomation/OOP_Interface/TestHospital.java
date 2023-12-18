package naveenautomation.OOP_Interface;

public class TestHospital {
    public static void main(String[] args) {
        FortisHospital f = new FortisHospital();
        f.physioServices();
        f.gynoServices();
        f.orthoServices();
        f.ENTService();
        f.cardioServices();
        f.dentalServices();
        f.oncologyService();
        f.emergencyServices();
        f.medicalInsurance();
        f.nursingTraining();
        System.out.println(USMedical.min_fee);
        System.out.println(f.min_fee);


        // top casting -> child class object can be referred by parent class interface ref variable

        USMedical us = new FortisHospital();
        us.emergencyServices();
        us.gynoServices();
        us.ENTService();

        // down casting now allowed -> creating object of interface and child class as ref variable
    }
}
