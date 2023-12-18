package naveenautomation.SessionNotes;

public class ConstructorConcepts {

    String name;
    int age;
    double salary;

public ConstructorConcepts() {
    System.out.println("Default constructor");
}

public ConstructorConcepts(String name){
    this.name = name;
}

    public static void main(String[] args) {
    ConstructorConcepts concepts = new ConstructorConcepts("Mani");
        System.out.println(concepts.name);

    }
}
