public class Array27 {

    public int[] sortArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; ++i) {
            for (int j = i; j < length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] getListMax(int[] arr, int k) {
        int[] arrResult = new int[k];
        if (k <= arr.length) {
            int[] arrTemp = sortArray(arr);
            int index = 0;
            for (int i = arr.length - 1; i >= 0 && index < k; --i) {
                arrResult[index++] = arr[i];
            }
        }
        return arrResult;
    }

}
