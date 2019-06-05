public class Array6 {

    public int[] sortArr(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j] && arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i] > arr[j] && arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
