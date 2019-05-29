public class Bai28 {

    public double getSqrt(double number) {
        if (number <= 0) {
            return 0;
        }
        double result = number / 2, temp;
        do {
            temp = result;
            result = 0.5 * (result + number / result);
        } while (result - temp != 0);
        return result;
    }
}
