package EdurekaAssignment;

class A1{
    int a = 10; int b = 20;

    void display(){
        System.out.println("In Class A - "+ a + " | " + b);
    }
}

class B1 extends A1{
    int a = 11; int b = 21;

    @Override
    void display(){
        System.out.println("In Class B - "+ a + " | " + this.b + " | " + super.a + " | "+ super.b);
    }
}

public class OverridingTest {

    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();

    }
}
