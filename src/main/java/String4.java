import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String4 {

    public boolean isNumber(char s) {
        if (s >= 48 && s <= 57) {
            return true;
        }
        return false;
    }

    public int getSumIntoString(String str) {
        int sum = 0;
        StringBuffer number = new StringBuffer("0");

        for (int i = 0; i < str.length(); ++i) {
            if (isNumber(str.charAt(i))) {

                number.append(str.charAt(i));
            } else {
                sum += Integer.parseInt(number.toString());
                number = new StringBuffer("0");
            }
        }
        sum += Integer.parseInt(number.toString());

        return sum;
    }
}
