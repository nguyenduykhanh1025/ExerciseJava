public class Bai20 {

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

    public int getSumOfFibonaci(int n) {
        String strFibonaci = layDaySoFibonaciKhongLonHon(n);
        String[] arrFibonaci = strFibonaci.split(" ");
        int sum = 0;
        for (int i = 0; i < arrFibonaci.length; ++i) {
            sum += Integer.parseInt(arrFibonaci[i]);
        }
        return sum;
    }
}
