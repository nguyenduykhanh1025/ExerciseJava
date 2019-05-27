public class Bai6 {

    public String giaiPhuongTrinhBac2(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return "vo nghiem";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return String.valueOf(x);
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a), x2 = (-b - Math.sqrt(delta)) / (2 * a);

        StringBuffer strTempOfResult = new StringBuffer();
        strTempOfResult.append(x1);
        strTempOfResult.append(" ");
        strTempOfResult.append(x2);
        return strTempOfResult.toString();
    }
}
