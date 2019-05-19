import java.math.BigInteger;

public class Bai12 {

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

    public String getResult(int n) {
        String str;
        double p = 0.0;
        for (int i = 0; i <= n; ++i) {
            p += 1.0 / layGiaThua(i).longValue();
        }
        return String.format("%.5f", p);
    }
}
