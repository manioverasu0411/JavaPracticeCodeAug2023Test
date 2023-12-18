package naveenautomation.SessionNotes;

public class User {

    String name;
    int age;
    String email;
    String city;
    String empId;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(String name, int age, String email, String city) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
    }

    public User(String name, int age, String email, String city, String empId) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
        this.empId = empId;
    }


}
