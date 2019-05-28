public class Bai16 {

    public double getLengthDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String findInfomationOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = getLengthDistance(x1, y1, x2, y2);
        double b = getLengthDistance(x1, y1, x3, y3);
        double c = getLengthDistance(x3, y3, x2, y2);
        StringBuffer strResult = new StringBuffer("khong phai la tam giac");
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            strResult = new StringBuffer("");

            double p = a + b + c;
            strResult.append(p + " ");

            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            strResult.append(S + " ");

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
    public static void main(String []a){
        System.out.println(new Bai16().findInfomationOfTriangle(-11,2,13,-4,4,11));
    }
}
