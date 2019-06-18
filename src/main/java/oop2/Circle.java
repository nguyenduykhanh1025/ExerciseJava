package oop2;

public class Circle implements Shape {

    private double x;
    private double y;
    private double r;

    @Override
    public String showInfo() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

}
