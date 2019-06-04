public class Array6 {

    public int[] insert(int[] arr, int indexValue, int indexInsert) {
        int tempValue = arr[indexValue];
        for (int i = indexValue; i > indexInsert; --i) {
            arr[i] = arr[i - 1];
        }
        arr[indexInsert] = tempValue;
        return arr;
    }

    public int[] sortArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i) {
            if (arr[i] % 2 == 0) {
                int indexInsert = -1;
                for (int j = i - 1; j >= 0; --j) {
                    if (arr[j] > arr[i] && arr[j] % 2 == 0) {
                        indexInsert = j;
                    }
                }
                if (indexInsert != -1) {
                    arr = insert(arr, i, indexInsert);
                }
            }
            if (arr[i] % 2 != 0) {
                int indexInsert = -1;
                for (int j = i - 1; j >= 0; --j) {
                    if (arr[j] < arr[i] && arr[j] % 2 != 0) {
                        indexInsert = j;
                    }
                }
                if (indexInsert != -1) {
                    arr = insert(arr, i, indexInsert);
                }
            }
        }
        return arr;
    }
}
