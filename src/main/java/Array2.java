public class Array2 {

    public int sumOfThreeNumberMax(int[] arr, int n) {

        int max = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < n - 2; ++i) {
            int sumTemp = arr[i];
            for (int j = i + 1; j < n - 1; ++j) {
                sumTemp += (arr[j] + arr[j + 1]);
                if (sumTemp > max) {
                    max = sumTemp;
                }
                sumTemp = arr[i];
            }
        }
        return max;
    }
}
