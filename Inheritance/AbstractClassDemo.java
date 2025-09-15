package Inheritance;

abstract class Vehicle {
    abstract void move();
    void fuel() { System.out.println("Needs fuel"); }
}

class Car extends Vehicle {
    @Override void move() { System.out.println("Car moves"); }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.move();
        v.fuel();
    }
}
