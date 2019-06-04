import java.util.HashMap;
import java.util.Map;

public class Bai30 {

    public String coverDecimalNumberToRomanNumber(int decimalNumber) {

        int[] arrKeyDecimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arrValueRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuffer result = new StringBuffer("");
        while (decimalNumber != 0) {
            for (int i = 0; i < arrKeyDecimal.length; ++i) {
                if (decimalNumber >= arrKeyDecimal[i]) {
                    result.append(arrValueRoman[i]);
                    decimalNumber -= arrKeyDecimal[i];
                    continue;
                }
            }
        }
        return result.toString();
    }
}
