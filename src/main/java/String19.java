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

        int surplus = 0;
        int subtract;

        for (indexB = b.length() - 1; indexB >= 0; --indexB) {

            int subtractTemp = (a.charAt(indexA) - '0') - (b.charAt(indexB) - '0') - surplus;

            if (subtractTemp >= 0) {
                subtract = subtractTemp;
            } else {
                subtract = 10 + subtractTemp;
            }

            surplus = subtractTemp >= 0 ? 0 : 1;

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
