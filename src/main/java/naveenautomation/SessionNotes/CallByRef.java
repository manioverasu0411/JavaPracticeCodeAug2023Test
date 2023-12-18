package naveenautomation.SessionNotes;

import dev.failsafe.Call;

public class CallByRef {

    public static void sendMail(CallByRef obj){
        System.out.println("Mail send");
       obj.readMail();
    }

    public void readMail(){
        System.out.println("Read Mail");
    }


    public static void goToSchool(CallByRef obj){
        System.out.println("going to school");
      //  obj = null;
        obj.withWhom();
    }

    public void withWhom(){
        System.out.println("With my friends");
        returnHome();


    }

    public static void returnHome(){
        System.out.println("After schooling, return to home with my friends");
    }


    public static void main(String[] args) {
        CallByRef obj = new CallByRef();
        //CallByRef.sendMail(obj);

        CallByRef.goToSchool(obj);
    }
}
