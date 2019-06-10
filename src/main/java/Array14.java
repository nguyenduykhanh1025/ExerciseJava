public class Array14 {

    public int[] getArrayFromTwoDimensional(int[][] arr) {

        int length = arr.length * arr[0].length;
        int index = 0;

        int[] arrResult = new int[length];

        int top = 0;
        int left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (index < length) {

            for (int k = left; k <= right; k++) {
                arrResult[index++] = arr[top][k];
            }
            top++;

            for (int k = top; k <= bottom; k++) {
                arrResult[index++] = arr[k][right];
            }
            right--;

            for (int k = right; k >= left && top<=bottom; k--) {
                arrResult[index++] = arr[bottom][k];
            }
            bottom--;

            for (int k = bottom; k >= top && left<=right; k--) {
                arrResult[index++] = arr[k][left];
            }
            left++;

        }
        return arrResult;
    }
}
