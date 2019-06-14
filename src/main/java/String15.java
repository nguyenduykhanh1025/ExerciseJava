public class String15 {

    public int getVerifyNumber(String strData) {

        int sum = 0;

        int i = 0;
        for (i = 0; i < strData.length(); ++i) {
            sum += (1 + 2* (i & 1))* (strData.charAt(i) - '0');
        }


        for (int j = 0; j <= 9; ++j) {
            if (i % 2 == 0) {
                if ((sum + j) % 10 == 0) {
                    return j++;
                }
            } else {
                if ((sum + j / 3) % 10 == 0) {
                    return j;
                }
            }
        }
        return -1;
    }
}
