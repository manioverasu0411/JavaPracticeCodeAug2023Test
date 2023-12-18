package naveenautomation.OOP_Encapsulation;

public class Browser {

    public void launchBrowser(){
        System.out.println("Launching Browser");
        checkRam();
        checkBrowserVersion();
        ustilsationCPU();

    }

    private void checkRam(){
        System.out.println("Checking Browser");
    }

    private void checkBrowserVersion(){
        System.out.println("Checing Browser version");
    }

    private void ustilsationCPU(){
        System.out.println("Checking cpu utilsation");
    }
}
