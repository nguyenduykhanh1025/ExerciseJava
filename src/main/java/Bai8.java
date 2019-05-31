import java.math.BigInteger;

public class Bai8 {
    public BigInteger findFactorial(int number) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= number; ++i) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial;
    }
}
