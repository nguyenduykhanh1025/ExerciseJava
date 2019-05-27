public class Bai12 {

    public int findFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public Double findSumFollowFn(int n) {
        double sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += 1.0 / findFactorial(i);
        }
        return (double) Math.round(sum * 10000) / 10000;
    }
}
