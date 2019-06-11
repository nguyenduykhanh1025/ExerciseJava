import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Array21 {

    public int[][] getSubMatrix(int[][] arr, int indexRowDelete, int indexColumnDelete) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] arrResult = new int[row - 1][column - 1];
        int[][] arrTemp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                arrTemp[i][j] = arr[i][j];
            }
        }

        for (int i = indexRowDelete; i < row - 1; ++i) {
            arrTemp[i] = arrTemp[i + 1];
        }
        for (int i = indexColumnDelete; i < column - 1; ++i) {
            for (int j = 0; j < row - 1; ++j) {
                arrTemp[j][i] = arrTemp[j][i + 1];
            }
        }
        for (int i = 0; i < row - 1; ++i) {
            for (int j = 0; j < column - 1; ++j) {
                arrResult[i][j] = arrTemp[i][j];
            }
        }

        return arrResult;
    }

    public int getDeterminantMatrix(int[][] arr) {
        int n = arr.length;
        int s, sum = 0;
        if (n == 1) {
            return arr[0][0];
        }
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                s = 1;
            } else {
                s = -1;
            }
            sum += arr[k][0] * s * getDeterminantMatrix(getSubMatrix(arr, k, 0));
        }
        return sum;
    }

}
