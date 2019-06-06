public class Array8 {

    public int getMinusOfMaxWithMinNumber(int[] arr, int n) {
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int i = 1; i < n; ++i) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        return maxNumber - minNumber;
    }
}
