public class Array14 {

    public int[] getArrayFromTwoDimensional(int[][] arr, int m, int n) {

        int length = n * m, index = 0;
        int[] arrResult = new int[length];
        int bottom = 0, right = 0, top = n - 1, left = m - 1;
        while (index < length) {

            for (int k = right; k <= left; k++) {
                arrResult[index++] = arr[bottom][k];
            }
            bottom++;

            for (int k = bottom; k <= top; k++) {
                arrResult[index++] = arr[k][left];
            }
            left--;

            for (int k = left; k >= right; k--) {
                if (index >= length) {
                    break;
                }
                arrResult[index++] = arr[top][k];
            }
            top--;

            for (int k = top; k >= bottom; k--) {
                arrResult[index++] = arr[k][right];
            }
            right++;

        }
        return arrResult;
    }

}
