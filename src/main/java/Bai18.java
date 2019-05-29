public class Bai18 {

    public int convertDecimalToBinaryNumberReverse(int numberDecimal) {
        StringBuffer strResult = new StringBuffer("");
        while (numberDecimal != 0) {
            strResult.append(numberDecimal % 2);
            numberDecimal /= 2;
        }
        return Integer.parseInt(strResult.toString());
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
