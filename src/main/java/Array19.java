public class Array19 {

    public int[][] sortMatrix(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int length = row * column;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i / column][i % column] > arr[j / column][j % column]) {
                    int temp = arr[j / column][j % column];
                    arr[j / column][j % column] = arr[i / column][i % column];
                    arr[i / column][i % column] = temp;
                }
            }
        }
        return arr;
    }

    public int[][] getMatrixSpiral(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int length = row * column;
        int indexX = 0;
        int indexY = 0;

        int[][] arrResult = new int[row][column];

        int bottom = 0;
        int right = 0;
        int top = row - 1;
        int left = column - 1;


        while (indexX < row) {

            for (int k = right; k <= left; k++) {
                arrResult[bottom][k] = arr[indexX][indexY++];
                if (indexY == column) {
                    indexX++;
                    indexY = 0;
                }
            }
            bottom++;

            for (int k = bottom; k <= top; k++) {
                arrResult[k][left] = arr[indexX][indexY++];
                if (indexY == column) {
                    indexX++;
                    indexY = 0;
                }
            }
            left--;

            for (int k = left; k >= right; k--) {
                if (indexX >= row) {
                    break;
                }
                arrResult[top][k] = arr[indexX][indexY++];
                if (indexY == column) {
                    indexX++;
                    indexY = 0;
                }
            }
            top--;
            for (int k = top; k >= bottom; k--) {
                if (indexX >= row) {
                    break;
                }
                arrResult[k][right] = arr[indexX][indexY++];
                if (indexY == column) {
                    indexX++;
                    indexY = 0;
                }
            }
            right++;
        }
        return arrResult;
    }

    public int[][] sortMatrixFollowSpiral(int arr[][]) {
        return getMatrixSpiral(sortMatrix(arr));
    }
}
