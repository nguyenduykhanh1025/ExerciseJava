public class String14 {

    public boolean isBarcode(String strData) {

        int sum = 0;

        for (int i = 0; i < strData.length(); ++i) {
            if (i % 2 == 0) {
                sum += Integer.parseInt(String.valueOf(strData.charAt(i)));
            } else {
                sum += 3 * Integer.parseInt(String.valueOf(strData.charAt(i)));
            }
        }

        return sum % 10 == 0 ? true : false;
    }
}
