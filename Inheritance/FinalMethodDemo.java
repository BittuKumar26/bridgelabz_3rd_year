package Inheritance;
class Base {
    public final void display() {
        System.out.println("Important logic");
    }
}

class Derived extends Base {}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
