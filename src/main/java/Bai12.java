public class Bai12 {

    public Double findSumFollowFn(int n) {
        double sum = 1;
        int factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
            sum += 1.0 / factorial;
        }
        return sum;
    }

}
