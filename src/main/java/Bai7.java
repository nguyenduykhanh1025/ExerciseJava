public class Bai7 {

    public int findSumFollowNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; ++i) {
            sum += i * (i + 1);
        }
        return sum;
    }
}
