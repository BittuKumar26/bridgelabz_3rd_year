package Inheritance;

class Shape {
    double area() { return 0; }
}

class Square extends Shape {
    private double side;
    public Square(double s) { side = s; }
    @Override double area() { return side * side; }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s = new Square(4);
        System.out.println(s.area());
    }
}
