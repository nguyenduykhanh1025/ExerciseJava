public class Bai13 {
    public int findFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public double findE() {
        double valueOfENext, e = 0;
        int i = 1;
        do {
            e += 1.0 / findFactorial(i);
            valueOfENext = e + 1.0 / findFactorial(i + 1);
            i++;
        } while (valueOfENext - e > 0.00001);
        return (double) Math.round(e * 100000) / 100000;
    }
}
