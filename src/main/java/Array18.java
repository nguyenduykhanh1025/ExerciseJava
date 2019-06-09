public class Array18 {

    public int[][] sortMatrix(int[][] arr, int n, int m) {

        int lenght = n * m;
        for (int i = 0; i < lenght - 1; i++) {
            for (int j = i + 1; j < lenght; j++) {
                if (arr[i / m][i % m] < arr[j / m][j % m]) {
                    int temp = arr[j / m][j % m];
                    arr[j / m][j % m] = arr[i / m][i % m];
                    arr[i / m][i % m] = temp;
                }
            }
        }

        for (int i = 0; i <= n / 2; ++i) {
            int[] temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }
}
