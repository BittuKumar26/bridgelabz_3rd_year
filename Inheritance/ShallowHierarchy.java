package Inheritance;

abstract class Employee {
    abstract double getSalary();
}

class Developer extends Employee {
    @Override double getSalary() { return 50000; }
}

class Manager extends Employee {
    @Override double getSalary() { return 80000; }
}

public class ShallowHierarchy {
    public static void main(String[] args) {
        Employee e = new Developer();
        System.out.println(e.getSalary());
    }
}
