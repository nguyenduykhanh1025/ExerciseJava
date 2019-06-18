public class String19 {

    public String addZero(String a, int countZero) {
        StringBuffer strATemp = new StringBuffer(a);
        for (int i = 0; i < countZero; ++i) {
            a = strATemp.insert(0, '0').toString();
            strATemp = new StringBuffer(a);
        }
        return a;
    }


    public String getSubtraction(String a, String b) {

        int instance = a.length() - b.length();
        boolean checkSign = true;

        if (instance < 0) {
            a = addZero(a, -instance);
        } else {
            b = addZero(b, instance);
        }

        if (a.compareTo(b) < 0) {
            String temp = a;
            a = b;
            b = temp;
            checkSign = false;
        }

        StringBuilder strResult = new StringBuilder();

        int indexA = a.length() - 1;
        int indexB;

        int numberB;
        int numberA;

        int surplus = 0;
        int subtract;

        for (indexB = b.length() - 1; indexB >= 0; --indexB) {

            numberA = a.charAt(indexA) - '0';
            numberB = b.charAt(indexB) - '0';

            if (numberA - numberB - surplus >= 0) {
                subtract = numberA - numberB - surplus;
            } else {
                subtract = 10 + numberA - numberB - surplus;
            }

            surplus = numberA - numberB - surplus >= 0 ? 0 : 1;

            strResult.insert(0, Math.abs(subtract));
            indexA--;

        }

        return !checkSign ? "-" + strResult.toString() : strResult.toString();
    }

    public int getDivision(String a, String b) {

        if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) {
            return 0;
        }

        StringBuilder bBuilder = new StringBuilder(b);

        while (bBuilder.length() < a.length()) {
            bBuilder.insert(0, "0");
        }

        b = bBuilder.toString();
        int result = 0;

        while (a.compareTo(b) >= 0) {
            a = getSubtraction(a, b);
            result++;
        }

        return result;
    }
}
