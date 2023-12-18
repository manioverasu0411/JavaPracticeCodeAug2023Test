package naveenautomation.OOP_Abstract;

public abstract class Pages {

    public Pages(){
        System.out.println("Page class constructor");
    }

    public abstract void title();
    public abstract void url();

    public void pageLoadTime(){
        System.out.println("Page load time out = 10 secs");
    }

    public final void logo(){
        System.out.println("App Logo");
    }

}
