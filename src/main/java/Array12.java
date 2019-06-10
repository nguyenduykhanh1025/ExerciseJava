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

    public int[] getInsertArrayAscending(int[] arr, int value) {
        int lenght = arr.length, i = 0;
        int[] arrResult = new int[lenght + 1];
        while (arr[i] < value)
            i++;
        arrResult = getInsert(arr, i, value);
        return arrResult;
    }
}

