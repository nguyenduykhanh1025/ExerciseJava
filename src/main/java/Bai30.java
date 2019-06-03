
public class Bai30 {

    public String coverDecimalNumberToRomanNumber(int decimalNumber) {
        StringBuffer result = new StringBuffer("");
        while (decimalNumber != 0) {
            if (decimalNumber >= 1000) {
                decimalNumber -= 1000;
                result.append("M");
            } else if (decimalNumber >= 900) {
                decimalNumber -= 900;
                result.append("C");
                result.append("M");
            } else if (decimalNumber >= 500) {
                decimalNumber -= 500;
                result.append("D");
            } else if (decimalNumber >= 400) {
                decimalNumber -= 400;
                result.append("C");
                result.append("D");
            } else if (decimalNumber >= 100) {
                decimalNumber -= 100;
                result.append("C");
            } else if (decimalNumber >= 90) {
                decimalNumber -= 90;
                result.append("X");
                result.append("C");
            } else if (decimalNumber >= 50) {
                decimalNumber -= 50;
                result.append("L");
            } else if (decimalNumber >= 40) {
                decimalNumber -= 40;
                result.append("X");
                result.append("L");
            } else if (decimalNumber >= 10) {
                decimalNumber -= 10;
                result.append("X");
            } else if (decimalNumber >= 9) {
                decimalNumber -= 9;
                result.append("I");
                result.append("X");
            } else if (decimalNumber >= 5) {
                decimalNumber -= 5;
                result.append("V");
            } else if (decimalNumber >= 4) {
                decimalNumber -= 4;
                result.append("I");
                result.append("V");
            } else {
                decimalNumber -= 1;
                result.append("I");
            }
        }
        return result.toString();
    }
}
