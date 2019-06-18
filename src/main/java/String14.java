public class String14 {

    public boolean isBarcode(String strData) {

        int sum = 0;

        for (int i = 0; i < strData.length(); ++i) {
            if (i % 2 == 0) {
                sum += strData.charAt(i) - '0';
            } else {
                sum += 3 * (strData.charAt(i) - '0');
            }
        }

        return sum % 10 == 0;
    }
}
