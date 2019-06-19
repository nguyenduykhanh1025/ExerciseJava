package oop2;

public class Quadrilateral implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

    @Override
    public String showInfo() {
        return "Quadrilateral";
    }

    @Override
    public double getArea() {
        Triangle triangle11 = new Triangle(x1, y1, x2, y2, x3, y3);
        Triangle triangle12 = new Triangle(x1, y1, x4, y4, x3, y3);

        Triangle triangle21 = new Triangle(x1, y1, x4, y4, x2, y2);
        Triangle triangle22 = new Triangle(x3, y3, x4, y4, x2, y2);

        double s1 = triangle11.getArea() + triangle12.getArea();
        double s2 = triangle21.getArea() + triangle22.getArea();

        return Math.min(s1,s2);
    }

    @Override
    public double getPerimeter() {
        return this.getAB() + this.getBC() + this.getCD() + this.getAD();
    }

    public double getAB() {
        return getLengthDistance(this.x1, this.y1, this.x2, this.y2);
    }

    public double getBC() {
        return getLengthDistance(this.x2, this.y2, this.x3, this.y3);
    }

    public double getCD() {
        return getLengthDistance(this.x3, this.y3, this.x4, this.y4);
    }

    public double getAD() {
        return getLengthDistance(this.x1, this.y1, this.x4, this.y4);
    }

    public double getLengthDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
}
