public class Bai18 {

    public int covertDecimalToDecimalreserve(int numberDecimal) {
        int resultDecimalToBirary = 0, jumpValue = 0;
        while (numberDecimal != 0) {
            resultDecimalToBirary += Math.pow(10, jumpValue++) * (numberDecimal % 2);
            numberDecimal /= 2;
        }
        return Integer.parseInt(new StringBuffer(String.valueOf(resultDecimalToBirary)).reverse().toString(), 2);
    }
}
