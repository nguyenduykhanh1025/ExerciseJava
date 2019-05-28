public class Bai15 {

    public String findInfomationOfTriangle(int a, int b, int c) {
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
}
