public class Array3 {

    public int findMinusOfSumEvenNumberWithSumOddNumber(int[] arrValue, int n) {
        int result = 0;
        for (int i = 0; i < n; ++i) {
            if (arrValue[i] % 2 == 0) {
                result += arrValue[i];
            } else {
                result -= arrValue[i];
            }
        }

        return result;
    }

}
