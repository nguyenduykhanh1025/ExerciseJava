public class Bai2 {

    public int findSumOfNumber(int number) {
        int lengthNumber = (int) Math.log10(number) + 1;
        int sum = 0;
        for (int i = 1; i <= lengthNumber; ++i) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}