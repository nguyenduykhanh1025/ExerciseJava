public class Array21 {

    public double getDeterminantMatrix(int[][] arr) {
        int n = arr.length;
        int[][] U = new int[n][n];
        int[][] L = new int[n][n];

        for (int i = 0; i < n; ++i) {
            U[i][i] = arr[i][i];
            L[i][i] = 1;
            for (int k = i + 1; k < n; ++k) {
                L[k][i] = arr[k][i] / U[i][i];
                U[i][k] = arr[i][k];
                U[k][i] = 0;
                L[i][k] = 0;
            }
            for (int k = i + 1; k < n; ++k) {
                for (int j = i + 1; j < n; ++j) {
                    arr[k][j] = arr[k][j] - L[k][i] * U[i][j];
                }
            }
        }

        double result = 1;
        for (int i = 0; i < n; ++i) {
            result *= arr[i][i];
        }
        return result;
    }
}
