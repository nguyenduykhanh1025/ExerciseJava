
public class Array21 {

    public int[][] getSubMatrix(int[][] arr, int indexRowDelete, int indexColumnDelete) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] arrResult = new int[row - 1][column - 1];
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                if (i == indexRowDelete) {
                    continue;
                } else if (j == indexColumnDelete) {
                    continue;
                } else {
                    arrResult[indexY][indexX++] = arr[i][j];
                    if (indexX > column - 2) {
                        indexX = 0;
                        indexY++;
                    }
                }
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
