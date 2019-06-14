public class String16 {


    public String getSum(String a, String b) {

        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuffer strResult = new StringBuffer();

        int indexA;
        int indexB = b.length() - 1;

        int surplus = 0;
        int numberB = 0;
        int numberA = 0;
        int sum = 0;

        for (indexA = a.length() - 1; indexA >= 0; --indexA) {

            numberA = a.charAt(indexA) - '0';
            numberB = b.charAt(indexB) - '0';

            sum = numberA + numberB + surplus;

            surplus = sum / 10;

            strResult.append(sum % 10);
            indexB--;
        }

        numberB = indexB >= 0 ? b.charAt(indexB--) - '0' : 0;
        sum = surplus == 1 ? numberB + 1 : numberB;
        strResult.append(sum % 10);

        return strResult.append(b.substring(0, indexB + 1)).reverse().toString();
    }

}
