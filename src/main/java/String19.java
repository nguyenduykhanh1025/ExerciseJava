public class String19 {

    public String addZero(String origin, int countZero) {
        StringBuilder strATemp = new StringBuilder(origin);

        for (int i = 0; i < countZero; i++) {
            strATemp.insert(0,'0');
        }

        return strATemp.toString();
    }


    public String getSubtraction(String a, String b) {

        int instance = a.length() - b.length();

        if (instance < 0) {
            a = addZero(a, -instance);
        } else {
            b = addZero(b, instance);
        }

        boolean negative = false;

        if (a.compareTo(b) < 0) {
            String temp = a;
            a = b;
            b = temp;
            negative = true;
        }

        StringBuilder strResult = new StringBuilder();

        int surplus = 0;

        for (int i = b.length() - 1; i >= 0; i--) {

            int subtract = a.charAt(i) - b.charAt(i) - surplus;

            surplus= 0;

            if (subtract < 0) {
                subtract += 10;
                surplus = 1;
            }

            strResult.insert(0, subtract);
        }

        if(negative){
            strResult.insert(0, '-');
        }

        return strResult.toString();
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
