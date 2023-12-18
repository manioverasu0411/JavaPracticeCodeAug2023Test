package naveenautomation.SessionNotes;

public class UserTest {

    public static void main(String[] args) {

        User u1 = new User("Mani");
        User u2 = new User("Mani",33);
        User u3 = new User("Venba",05,"Venba@gamil.com");

        System.out.println(u3.name+" "+u3.age+" "+u3.email);



    }
}
