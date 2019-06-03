public class Bai25 {

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

    public int getCountFibonaciFromMToN(int m, int n) {
        String strFibonaci = layDaySoFibonaciKhongLonHon(n);
        String[] arrFibonaci = strFibonaci.split(" ");
        int i = arrFibonaci.length - 1, sumResult = 0;
        while (Integer.parseInt(arrFibonaci[i--]) >= m) {
            sumResult++;
        }
        return sumResult;
    }

}
