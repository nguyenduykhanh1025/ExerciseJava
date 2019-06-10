public class Array18 {

    public int[][] sortMatrix(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int length = row * column;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i / column][i % column] < arr[j / column][j % column]) {
                    int temp = arr[j / column][j % column];
                    arr[j / column][j % column] = arr[i / column][i % column];
                    arr[i / column][i % column] = temp;
                }
            }
        }

        for (int i = 0; i <= row / 2; ++i) {
            int[] temp = arr[i];
            arr[i] = arr[row - i - 1];
            arr[row - i - 1] = temp;
        }
        return arr;
    }
}
