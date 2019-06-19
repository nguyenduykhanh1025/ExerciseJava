package oop1;

public class Triangle {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public double getLengthDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public typeShape getType() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        if ((a + b) > c && (b + c) > a && (a + c) > b) {

            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                return typeShape.RIGHT_TRIANGLE;
            } else if (a == b || a == c || b == c) {
                return typeShape.ISOSCELES_TRIANGLE;
            } else {
                return typeShape.NORMAL;
            }
        }
        return typeShape.INVALID;
    }

    public double getPerimeter() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);

        if (this.getType() != typeShape.INVALID) {
            return a + b + c;
        }
        return -1;
    }

    public double getArea() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        double p = getPerimeter();
        if (p != -1) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return -1;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
}
