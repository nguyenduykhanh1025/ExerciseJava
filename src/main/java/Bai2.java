public class Bai2 {

    public int findSumOfNumber(int number) {
        int lengthNumber = (int) Math.log10(number) + 1;
        int sum = 0;
        for (int i = lengthNumber - 1; i > 0; --i) {
            sum += (int) (number / Math.pow(10, i));
            number = number % (int) Math.pow(10, i);
        }
        sum += number;
        return sum;
    }

}