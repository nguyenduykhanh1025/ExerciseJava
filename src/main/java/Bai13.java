import java.math.BigInteger;

public class Bai13 {

    public BigInteger layGiaThua(int n) {
        BigInteger p = new BigInteger("1");
        if (n <= 1) {
            return p;
        }
        for (int i = 2; i <= n; ++i) {
            BigInteger index = new BigInteger(String.format("%d", i));
            p = p.multiply(index);
        }
        return p;
    }

    public String tinhTongE() {
        double result = 2.0;
        double oldValue = result, newValue = 0.0;
        int i = 2;
        do {
            if (newValue != 0.0) {
                oldValue = newValue;
            }
            newValue = 1.0 / layGiaThua(i).longValue();
            result += newValue;
            i++;

        } while (oldValue - newValue > 0.00001);
        return String.format("%.6f", result);
    }
}
