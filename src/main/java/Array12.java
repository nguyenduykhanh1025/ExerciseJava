public class Array12 {

    public int[] getInsert(int[] arr, int insertTo, int value) {
        int lenght = arr.length;
        int[] arrTemp = new int[lenght + 1];
        System.arraycopy(arr, 0, arrTemp, 0, lenght);
        for (int i = lenght; i > insertTo; --i) {
            arrTemp[i] = arr[i - 1];
        }
        arrTemp[insertTo] = value;
        return arrTemp;
    }

    public int[] getInsertArrayAscending(int[] arr, int value, int start, int stop) {
        if (arr[arr.length - 1] < value) {
            return getInsert(arr, arr.length, value);
        }
        if (arr[0] > value) {
            return getInsert(arr, 0, value);
        }
        int mid = (start + stop) / 2;
        if (value > arr[mid + 1]) {
            return getInsertArrayAscending(arr, value, mid, stop);
        } else if (value < arr[mid]) {
            return getInsertArrayAscending(arr, value, start, mid);
        } else {
            return getInsert(arr, mid + 1, value);
        }
    }
}
