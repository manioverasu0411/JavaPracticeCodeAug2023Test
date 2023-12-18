package naveenautomation.OOP_Abstract;

public class PageTest {

    public static void main(String[] args) {

        LoginPage lp = new LoginPage();
        lp.title();
        lp.url();
        lp.pageLoadTime();
        lp.logo();
        lp.doLogin("Mani","123sdrf");

        System.out.println("_______________");

        // top casting : child class object can be referred by parent abstract
        Pages p = new LoginPage();
        p.url();
        p.pageLoadTime();
        p.logo();
        p.title();



}}
