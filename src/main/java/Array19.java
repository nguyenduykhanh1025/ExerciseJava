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
        int length = arr.length * arr[0].length;
        int indexX = 0;
        int indexY = 0;

        int[][] arrResult = new int[arr.length][arr[0].length];

        int top = 0;
        int left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (indexX < arr.length) {

            for (int k = left; k <= right; k++) {
                arrResult[top][k] = arr[indexX][indexY++];
                if(indexY == arr[0].length){
                    indexX++;
                    indexY = 0;
                }
            }
            top++;

            for (int k = top; k <= bottom; k++) {
                arrResult[k][right] = arr[indexX][indexY++];
                if(indexY == arr[0].length){
                    indexX++;
                    indexY = 0;
                }
            }
            right--;

            for (int k = right; k >= left && top<=bottom; k--) {
                arrResult[bottom][k] = arr[indexX][indexY++];
                if(indexY == arr[0].length){
                    indexX++;
                    indexY = 0;
                }
            }
            bottom--;

            for (int k = bottom; k >= top && left<=right; k--) {
                arrResult[k][left] = arr[indexX][indexY++];
                if(indexY == arr[0].length){
                    indexX++;
                    indexY = 0;
                }
            }
            left++;

        }
        return arrResult;
    }

    public int[][] sortMatrixFollowSpiral(int arr[][]) {
        return getMatrixSpiral(sortMatrix(arr));
    }

    public static void main(String []s){

    }
}
