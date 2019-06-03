public class Bai18 {

    public int convertDecimalToBinaryNumber(int numberDecimal) {
        int resultDecimalToBirary = 0, jumpValue = 0;
        while (numberDecimal != 0) {
            resultDecimalToBirary += Math.pow(10, jumpValue++) * (numberDecimal % 2);
            numberDecimal /= 2;
        }
        return resultDecimalToBirary;
    }

    public int covertDecimalToDecimalreserve(int numberDecimal) {
        int binaryNumber = convertDecimalToBinaryNumber(numberDecimal);
        int lengthNumber = (int) Math.log10(binaryNumber), sumresult = 0;
        while (lengthNumber >= 0) {
            sumresult += (binaryNumber % 10 * Math.pow(2, lengthNumber--));
            binaryNumber /= 10;
        }
        return sumresult;
    }
}
