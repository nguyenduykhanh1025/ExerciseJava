public class Bai17 {

    public boolean isNumberHaveSumExponential(int number) {
        int sum = 0, tempNumber = number;
        int lenghtOfNumber = (int) Math.log10(tempNumber) + 1;
        while (tempNumber != 0) {
            sum += Math.pow(tempNumber % 10, lenghtOfNumber);
            tempNumber /= 10;
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
