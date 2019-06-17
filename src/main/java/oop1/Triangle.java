package oop1;

public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public double getLengthDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String getType() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        StringBuffer strResult = new StringBuffer("khong phai la tam giac");
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            strResult = new StringBuffer("");


            if (Math.sqrt(a * a + b * b) == c || Math.sqrt(b * b + c * c) == a || Math.sqrt(a * a + c * c) == b) {
                strResult.append("vuong");
            } else if (a == b || a == c || b == c) {
                strResult.append("can");
            } else {
                strResult.append("thuong");
            }
        }
        return strResult.toString();
    }

    public double getPerimeter() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        double S;
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            return a + b + c;
        }
        return -1;
    }

    public double getArea() {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        double S;
        double p = getPerimeter();
        if (p != -1) {
            S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return S;
        }
        return -1;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

}
