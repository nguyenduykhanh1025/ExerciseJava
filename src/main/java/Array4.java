public class Array4 {

    public int[] sortArray(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j])
                        || (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j])
                        || (arr[i] % 2 != 0 && arr[j] % 2 == 0)) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        return arr;
    }

}
