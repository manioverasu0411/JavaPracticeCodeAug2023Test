package naveenautomation.OOP_Encapsulation;

public class emp_Test {

    public static void main(String[] args) {

        /*Employee e = new Employee();
        e.setName("Mani");
        e.setId(172);
        e.setCity("Madurai");
        e.setPermanent(true);

        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getCity());
        System.out.println(e.isPermanent());*/

        // user Registration
        Employee e2 = new Employee("Vini",173,"Chennai",true);
        System.out.println(e2.getName());
        System.out.println(e2.getId());
        System.out.println(e2.getCity());
        System.out.println(e2.isPermanent());

        // update user information
        e2.setName("Venba");
        e2.setCity("Madurai");

        // display user info
        System.out.println(e2.getName());
        System.out.println(e2.getId());
        System.out.println(e2.getCity());
        System.out.println(e2.isPermanent());


    }
}
