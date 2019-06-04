public class Array8 {

    public int getMinusOfMaxWithMinNumber(int[] arr, int n) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int delta = Math.abs(arr[j] - arr[i]);
                if (delta > result) {
                    result = delta;
                }
            }
        }
        return result;
    }
}
