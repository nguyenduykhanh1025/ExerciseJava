public class Bai2 {

    public int findSumOfNumber(int number) {
        int lengthNumber = (int) Math.log10(number) + 1;
        int sum = 0;
        for (int i = lengthNumber - 1; i > 0; --i) {
            int valueDenominator = (int)Math.pow(10,i);
            sum += (int) (number / valueDenominator);
            number = number % (int) valueDenominator;
        }
        sum += number;
        return sum;
    }

}