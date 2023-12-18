package naveenautomation.OOP_Abstract;

public class LoginPage extends Pages{
    @Override
    public void title() {
        System.out.println("The title is: Login");
    }

    @Override
    public void url() {
        System.out.println("Login page url is: URL");
    }

    @Override
    public void pageLoadTime() {
        System.out.println("Page load time out = 2 secs");
    }

    public void doLogin(String UN, String PW){
        System.out.println("Logged in user with: "+UN +"   "+PW);
    }


}
