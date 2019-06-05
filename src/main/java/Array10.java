public class Array10 {

    public int[][] splitN(int[] arr, int n) {

        int lenght = arr.length;
        int[][] arrResult = new int[(int) Math.round(lenght * 1.0 / n)][n];
        int x = 0, y = 0;

        for (int i = 1; i <= lenght; ++i) {
            arrResult[x][y++] = arr[i - 1];
            if (i % n == 0) {
                x++;
                y = 0;
            }
        }
        return arrResult;
    }
}
