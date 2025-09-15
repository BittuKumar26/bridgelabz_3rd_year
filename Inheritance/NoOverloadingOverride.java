package Inheritance;
class Printer {
    void print(String msg) { System.out.println("Base: " + msg); }
}

class LaserPrinter extends Printer {
    @Override void print(String msg) { System.out.println("Laser: " + msg); }
}

public class NoOverloadingOverride {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print("Hello");
    }
}
