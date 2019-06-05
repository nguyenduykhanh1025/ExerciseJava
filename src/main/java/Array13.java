public class Array13 {

    public int[][] rotateArray90Degrees(int[][] arr, int n, int m) {
        int[][] result = new int[n][m];
        for (int i = 0; i < n; ++i) {
            int k = m - 1;
            for (int j = 0; j < m; ++j) {
                result[i][j] = arr[k][i];
                k--;
            }
        }
        return result;
    }
}
