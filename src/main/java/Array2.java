public class Array2 {

    public int sumOfThreeNumberMax(int[] arr, int n) {

        int maxPrevious = Integer.MAX_VALUE;
        int jump = 0, sum = 0;
        while (jump++ != 3) {
            int maxValue = 0;
            for (int i = 0; i < n; ++i) {
                if (arr[i] > maxValue && arr[i] < maxPrevious) {
                    maxValue = arr[i];
                }
            }
            sum += maxValue;
            maxPrevious = maxValue;
        }

        return sum;
    }
}
