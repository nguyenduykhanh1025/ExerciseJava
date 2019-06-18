public class String16 {

    private static int getDigit(String x, int fromRight) {

        if (fromRight < x.length()) {
            return x.charAt(x.length() - 1 - fromRight) - '0';
        }

        return 0;
    }

    public String getSum(String a, String b) {

        StringBuilder strResult = new StringBuilder();

        int surplus = 0;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {

            int sum = surplus + getDigit(a, i) + getDigit(b, i);

            surplus = sum / 10;

            strResult.insert(0, sum % 10);
        }

        if (surplus > 0) {
            strResult.insert(0, 1);
        }

        return strResult.toString();
    }

}
