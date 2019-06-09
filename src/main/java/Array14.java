public class Array14 {

    public int[] getArrayFromTwoDimensional(int[][] arr, int m, int n) {

        int lenght = n * m, index = 0, row = n - 1, column = m - 1;
        int[] arrResult = new int[lenght];
        int i = 0, j = 0;
        while (index < lenght) {

            for (int k = j; k <= column; k++) {
                arrResult[index++] = arr[i][k];
            }
            i++;

            for (int k = i; k <= row; k++) {
                arrResult[index++] = arr[k][column];
            }
            column--;

            for (int k = column; k >= j; k--) {
                if (index >= lenght) {
                    break;
                }
                arrResult[index++] = arr[row][k];
            }
            row--;

            for (int k = row; k >= i; k--) {
                arrResult[index++] = arr[k][j];
            }
            j++;

        }
        return arrResult;
    }

    public static void main(String[] s) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] arrResult = new Array14().getArrayFromTwoDimensional(arr, 3, 3);
        for (int i = 0; i < 9; ++i) {
            System.out.println(arrResult[i]);
        }
    }
}
