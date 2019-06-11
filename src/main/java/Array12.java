public class Array12 {

    public int[] insertInArray(int[] arr, int insertTo, int value) {
        int length = arr.length;
        int[] arrTemp = new int[length + 1];

        System.arraycopy(arr, 0, arrTemp, 0, length);
        for (int i = length; i > insertTo; --i) {
            arrTemp[i] = arr[i - 1];
        }
        arrTemp[insertTo] = value;
        return arrTemp;
    }

    public int[] getInsertArrayAscending(int[] arr, int value) {
        int length = arr.length, i = 0;
        int[] arrResult;
        while (arr[i] < value)
            i++;
        arrResult = insertInArray(arr, i, value);
        return arrResult;
    }

}

