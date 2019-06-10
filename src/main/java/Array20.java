public class Array20 {

    public int[][] getSubMatrix(int[][] arr, int x, int y, int n, int b) {

        if (arr[0].length * arr.length - (x * arr[0].length + (y)) < n * b) {
            return null;
        }

        int[][] arrResult = new int[b][n];
        for (int i = 0; i < b; ++i) {
            for (int j = 0; j < n; ++j) {
                arrResult[i][j] = arr[x][y++];
                if (y >= arr[0].length) {
                    x++;
                    y = 0;
                }
            }
        }
        return arrResult;
    }
}

