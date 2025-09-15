package Inheritance;

interface Drivable { void drive(); }
interface Insurable { void insure(); }

class Car implements Drivable, Insurable {
    public void drive() { System.out.println("Car driving"); }
    public void insure() { System.out.println("Car insured"); }
}

public class InterFaceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.insure();
    }
}
