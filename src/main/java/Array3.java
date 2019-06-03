public class Array3 {

    public int findMinusOfSumEvenNumberWithSumOddNumber(int[] arrValue, int n) {
        int sumEvenNumber = 0, sumOddNumber = 0;
        for (int i = 0; i < n; ++i) {
            if (arrValue[i] % 2 == 0) {
                sumEvenNumber += arrValue[i];
            } else {
                sumOddNumber += arrValue[i];
            }
        }

        return sumEvenNumber - sumOddNumber;
    }

}
