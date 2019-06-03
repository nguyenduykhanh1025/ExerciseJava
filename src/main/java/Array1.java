public class Array1 {
    public String findNumberAppearTwice(float[] arrayValue, int n) {

        StringBuffer arrayNumberAppearTwice = new StringBuffer("");
        boolean[] arrCheck = new boolean[n];
        for (int i = 0; i < n; ++i) {
            arrCheck[i] = false;
        }

        for (int i = 0; i < n - 1; ++i) {
            if (arrCheck[i] == true) {
                continue;
            }
            arrCheck[i] = true;
            boolean checkTwice = false;
            for (int j = i + 1; j < n; ++j) {
                if (arrayValue[i] == arrayValue[j]) {
                    checkTwice = true;
                    arrCheck[j] = true;
                }
            }
            if (checkTwice == true) {
                arrayNumberAppearTwice.append(arrayValue[i] + " ");
            }
        }
        return arrayNumberAppearTwice.toString().trim();
    }
}
