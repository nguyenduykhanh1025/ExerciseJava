public class Bai18 {

    public int convertDecimalToBinaryNumberReverse(int numberDecimal) {

        int resultDecimalToBirary = 0, jumpValue = 0;
        while (numberDecimal != 0) {
            resultDecimalToBirary += Math.pow(10, jumpValue++) * (numberDecimal % 2);
            numberDecimal /= 2;
        }

        int result = 0;
        jumpValue--;
        while (resultDecimalToBirary != 0) {
            result += Math.pow(10, jumpValue--) * (resultDecimalToBirary % 10);
            resultDecimalToBirary /= 10;
        }
        return result;
    }

    public int covertBinaryToDecumalNumber(int numberBinary) {
        int sum = 0;
        int lenghtNumber = (int) Math.log10(numberBinary) + 1;
        for (int i = 0; i < lenghtNumber; ++i) {
            sum += (numberBinary % 2) * Math.pow(2, i);
            numberBinary /= 10;
        }
        return sum;
    }

    public int getNumberReverseFromCovertBinary(int number) {
        return covertBinaryToDecumalNumber(convertDecimalToBinaryNumberReverse(number));
    }

}
