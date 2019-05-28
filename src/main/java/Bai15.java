public class Bai15 {

    public String findInfomationOfTriangle(int a, int b, int c) {
        StringBuffer strResult = new StringBuffer("khong phai la tam giac");
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            strResult = new StringBuffer("");

            double p = a + b + c;
            strResult.append(p + " ");

            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            strResult.append(S + " ");

            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                strResult.append("vuong");
            } else if (a == b || a == c || b == c) {
                strResult.append("can");
            } else {
                strResult.append("thuong");
            }
        }
        return strResult.toString();
    }
}
