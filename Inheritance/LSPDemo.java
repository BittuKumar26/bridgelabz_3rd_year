package Inheritance;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double w, h;
    public Rectangle(double w, double h) { this.w = w; this.h = h; }
    @Override double area() { return w * h; }
}

class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    @Override double area() { return Math.PI * r * r; }
}

public class LSPDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Circle(3);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
