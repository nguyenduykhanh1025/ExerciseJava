import java.util.HashMap;

public class Bai29 {

    public int coverRomanNumberToDecimalNumber(String romanNumber) {

        HashMap<Character, Integer> hmRomanNumber = new HashMap<>();
        hmRomanNumber.put('I', 1);
        hmRomanNumber.put('V', 5);
        hmRomanNumber.put('X', 10);
        hmRomanNumber.put('L', 50);
        hmRomanNumber.put('C', 100);
        hmRomanNumber.put('D', 500);
        hmRomanNumber.put('M', 1000);

        int lengtNumber = romanNumber.length();
        int sumresult = hmRomanNumber.get(romanNumber.charAt(lengtNumber - 1));
        int numberPrevious = sumresult;
        for (int i = romanNumber.length() - 2; i >= 0; --i) {
            int numberCurent = hmRomanNumber.get(romanNumber.charAt(i));
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
