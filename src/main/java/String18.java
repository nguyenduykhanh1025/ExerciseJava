public class String18 {

    public String addZero(String a, int countZero) {
        StringBuffer strATemp = new StringBuffer(a);
        for (int i = 0; i < countZero; ++i) {
            a = strATemp.append("0").toString();
            strATemp = new StringBuffer(a);
        }
        return a;
    }

    public int getSum(String a, String b) {


        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuffer strResult = new StringBuffer("");

        int indexA;
        int indexB = b.length() - 1;

        int surplus = 0;
        int numberB = 0;
        int numberA = 0;
        int sum = 0;

        for (indexA = a.length() - 1; indexA >= 0; --indexA) {

            numberA = a.charAt(indexA) - 48;
            numberB = b.charAt(indexB) - 48;

            sum = numberA + numberB + surplus;

            surplus = sum >= 10 ? 1 : 0;

            strResult.append(sum % 10);
            indexB--;
        }

        numberB = indexB >= 0 ? b.charAt(indexB--) - 48 : 0;
        sum = surplus == 1 ? numberB + 1 : numberB;
        strResult.append(sum % 10);

        for (int i = indexB; i >= 0; --i) {
            strResult.append(b.charAt(i));
        }

        return Integer.parseInt(strResult.reverse().toString());
    }

    public int getMultiplication(String a, String b) {

        String result = "0";
        for (int i = b.length() - 1; i >= 0; --i) {

            int numberB = b.charAt(i) - 48;
            int numberA = 0;
            int surplus = 0;

            StringBuffer strResultTemp = new StringBuffer("");

            for (int j = a.length() - 1; j >= 0; --j) {
                numberA = a.charAt(j) - 48;

                strResultTemp.append((numberB * numberA) % 10 + surplus);
                surplus = (numberA * numberB) / 10;
            }

            if (surplus != 0) {
                strResultTemp = strResultTemp.append(surplus);
            }

            String temp = strResultTemp.reverse().toString();
            temp = addZero(temp, b.length() - i - 1);
            result = String.valueOf(getSum(temp, result));
        }
        return Integer.parseInt(result);
    }

}
