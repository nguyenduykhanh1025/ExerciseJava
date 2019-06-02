public class Bai18 {

    public int convertDecimalToBinaryNumber(int numberDecimal) {
        int resultDecimalToBirary = 0, jumpValue = 0;
        while (numberDecimal != 0) {
            resultDecimalToBirary += Math.pow(10, jumpValue++) * (numberDecimal % 2);
            numberDecimal /= 2;
        }
        return resultDecimalToBirary;
    }

    public int convertDecimalToBinaryNumberReverse(int numberDecimal) {
        int resultDecimalToBirary = convertDecimalToBinaryNumber(numberDecimal);
        int result = 0, lenghtValue = (int) Math.log10(resultDecimalToBirary);
        while (resultDecimalToBirary != 0) {
            result += Math.pow(10, lenghtValue--) * (resultDecimalToBirary % 10);
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
