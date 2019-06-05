public class Bai18 {

    public int covertDecimalToDecimalreserve(int numberDecimal) {
        int resultDecimal = 0, jumpValue = 0;
        while (numberDecimal != 0) {
            resultDecimal = (resultDecimal << 1) | (numberDecimal & 1);
            numberDecimal >>= 1;
        }
        return resultDecimal;
    }
}
