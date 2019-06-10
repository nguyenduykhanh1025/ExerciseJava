public class Array22 {

    public int[][] getSubMatrix(int[][] arr, int indexRowDelete, int indexColumnDelete) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] arrResult = new int[row - 1][column - 1];

        for (int i = indexRowDelete; i < row - 1; ++i) {
            arr[i] = arr[i + 1];
        }
        for (int i = indexColumnDelete; i < column - 1; ++i) {
            for (int j = 0; j < row - 1; ++j) {
                arr[j][i] = arr[j][i + 1];
            }
        }
        for (int i = 0; i < row - 1; ++i) {
            for (int j = 0; j < column - 1; ++j) {
                arrResult[i][j] = arr[i][j];
            }
        }

        return arrResult;
    }

}
