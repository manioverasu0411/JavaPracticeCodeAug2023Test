package naveenautomation.OOP_Interface;


// No method body and only declration this is called abract method

public interface USMedical {

    int min_fee = 10; // always static or final

    public void physioServices();
    public void gynoServices();
    public void orthoServices();
    public void ENTService();
    public void emergencyServices();
}
