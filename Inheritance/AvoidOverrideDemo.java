package Inheritance;

class Bank {
    void services() { System.out.println("Basic services"); }
}

class Branch extends Bank {}

public class AvoidOverrideDemo {
    public static void main(String[] args) {
        Bank b = new Branch();
        b.services();
    }
}
