public class Bai19 {

    public int getFactorial(int number) {
        int p = 1;
        for (int i = 2; i <= number; ++i) {
            p *= i;
        }
        return p;
    }

    public double getnCk(int n, int k) {
        if (n <= k) {
            return -1;
        }
        return getFactorial(n) / (getFactorial(k) * getFactorial(n - k));
    }

    public String getTrianglePascalAtN(int n) {
        if (n <= 0) {
            return "err";
        }
        StringBuffer strResult = new StringBuffer("");
        strResult.append("1 ");
        if (n == 1) {
            return strResult.toString();
        }

        for (int i = 1; i < n - 1; ++i) {
            strResult.append((int) getnCk(n - 1, i) + " ");
        }
        strResult.append("1");
        return strResult.toString();
    }

}
