package oop2;

public class Triangle implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    @Override
    public String showInfo() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        double perimeter = this.getPerimeter();
        double a = getEdgeA();
        double b = getEdgeB();
        double c = getEdgeC();
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

    @Override
    public double getPerimeter() {
        return getEdgeA() + getEdgeB() + getEdgeC();
    }

    public double getEdgeA() {
        return getLengthDistance(x1, y1, x2, y2);
    }

    public double getEdgeB() {
        return getLengthDistance(x1, y1, x3, y3);
    }

    public double getEdgeC() {
        return getLengthDistance(x2, y2, x3, y3);
    }

    public double getLengthDistance(double x1, double y1, double x2, double y2) {
        return 1.0 * Math.sqrt(Math.pow(x2 - x1, 2) * 1.0 + Math.pow(y2 - y1, 2));
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Triangle(Triangle triangle) {
        this.x1 = triangle.x1;
        this.x2 = triangle.x2;
        this.x3 = triangle.x3;
        this.y1 = triangle.y1;
        this.y2 = triangle.y2;
        this.y3 = triangle.y3;
    }
}
