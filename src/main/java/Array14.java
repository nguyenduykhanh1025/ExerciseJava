public class Array14 {

    public int[] getArrayFromTwoDimensional(int[][] arr) {

        int length = arr.length * arr[0].length;
        int index = 0;

        int[] arrResult = new int[length];

        int bottom = 0;
        int right = 0;
        int top = arr.length - 1;
        int left = arr[0].length - 1;

        while (index < length) {

            for (int k = right; k <= left; k++) {
                if (index >= length) {
                    break;
                }
                arrResult[index++] = arr[bottom][k];
            }
            bottom++;

            for (int k = bottom; k <= top; k++) {
                if (index >= length) {
                    break;
                }
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
                if (index >= length) {
                    break;
                }
                arrResult[index++] = arr[k][right];
            }
            right++;

        }
        return arrResult;
    }
}
