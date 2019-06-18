public class String18 {

    public String addZero(String a, int countZero) {
        StringBuffer strATemp = new StringBuffer(a);
        for (int i = a.length(); i < countZero + a.length(); ++i) {
            strATemp.insert(i, '0');
        }
        return strATemp.toString();
    }

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

    public String getMultiplication(String a, String b) {

        String result = "0";
        for (int i = b.length() - 1; i >= 0; --i) {

            int numberB = b.charAt(i) - '0';
            int numberA;
            int surplus = 0;

            StringBuffer strResultTemp = new StringBuffer("");

            for (int j = a.length() - 1; j >= 0; --j) {
                numberA = a.charAt(j) - '0';

                strResultTemp.append((numberB * numberA) % 10 + surplus);
                surplus = (numberA * numberB) / 10;
            }

            if (surplus != 0) {
                strResultTemp = strResultTemp.append(surplus);
            }

            String temp = strResultTemp.reverse().toString();
            temp = addZero(temp, b.length() - i - 1);
            result = getSum(temp, result);

        }

        return result;
    }
}
