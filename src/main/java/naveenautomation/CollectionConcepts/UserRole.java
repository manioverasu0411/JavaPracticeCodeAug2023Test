package naveenautomation.CollectionConcepts;

import java.util.HashMap;

public class UserRole {

    public static String getUserCredentials(String role){
        HashMap<String,String>userMap = new HashMap<String,String>();
        userMap.put("Admin","admin:admin123");
        userMap.put("seller","seller:seller123");
        userMap.put("vendor","vendor:vendor123");
        userMap.put("manager","manager:man123");

        return userMap.get(role);
    }

    public static void doLogin(String un, String pw){
        System.out.println("Login with:"+un +" "+pw);

    }


    public static void main(String[] args) {
        String credData = getUserCredentials("manager");
        System.out.println(credData);
        String userName = credData.split(":")[0];
        String password = credData.split(":")[1];

        doLogin(userName,password);


    }
}
