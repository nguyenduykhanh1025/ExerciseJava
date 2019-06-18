public class String15 {

    public int getVerifyNumber(String strData) {

        int sum = 0;

        for (int i = 0; i < strData.length(); ++i) {
            sum += (1 + 2 * (i & 1)) * (strData.charAt(i) - '0');
        }

        return (10 - sum % 10) % 10;
    }
}
