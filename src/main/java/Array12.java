public class Array12 {

    public int[] insertInArray(int[] arr, int insertTo, int value) {
        int length = arr.length;
        int[] arrTemp = new int[length + 1];

        System.arraycopy(arr, 0, arrTemp, 0, length);
        System.arraycopy(arr, insertTo, arrTemp, insertTo + 1, length - insertTo);
        arrTemp[insertTo] = value;
        return arrTemp;
    }

    public int[] getInsertArrayAscending(int[] arr, int value) {
        int i = 0;
        int[] arrResult;
        while (arr[i] < value)
            i++;
        arrResult = insertInArray(arr, i, value);
        return arrResult;
    }

}

