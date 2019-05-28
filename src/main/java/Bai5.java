public class Bai5 {
    public String layDaySoFibonaciKhongLonHon(int number) {
        if (number <= 0) {
            return "";
        }
        int a = 1, b = 1;
        StringBuffer strResult = new StringBuffer("1 1 ");
        while ((a + b) <= number) {
            int temp = a;
            a = b;
            b = temp + b;
            strResult.append(b + " ");
        }
        return strResult.toString().trim();
    }
}
