public class Bai29 {

    public int getSingleDecimalNumber(char romanNumber) {
        if (romanNumber == 'I')
            return 1;
        else if (romanNumber == 'V')
            return 5;
        else if (romanNumber == 'X')
            return 10;
        else if (romanNumber == 'L')
            return 50;
        else if (romanNumber == 'C')
            return 100;
        else if (romanNumber == 'D')
            return 500;
        else if (romanNumber == 'M')
            return 1000;
        return 0;
    }

    public int coverRomanNumberToDecimalNumber(String romanNumber) {
        int lengtNumber = romanNumber.length();
        int sumresult = getSingleDecimalNumber(romanNumber.charAt(lengtNumber - 1));
        int numberPrevious = sumresult;
        for (int i = romanNumber.length() - 2; i >= 0; --i) {
            int numberCurent = getSingleDecimalNumber(romanNumber.charAt(i));
            if (numberCurent < numberPrevious) {
                sumresult -= numberCurent;
            } else {
                sumresult += numberCurent;
            }
            numberPrevious = numberCurent;
        }
        return sumresult;
    }
}
