package naveenautomation.assignments.conditionalStatements;

public class BrowserSelectingUsingSwitch {
    public static void main(String[] args) {

        String browser = "CHROME";

        switch (browser.toLowerCase()){
            case "chrome":
            case "firefox":
            case "edge":
                System.out.println(browser+" launched successfully");
                break;
            default:{
                System.out.println("Please select valid browser name");
                break;
            }

        }


    }
}
