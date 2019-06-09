public class Array17 {

    public int[][] getMatrixSprial(int n){
        int lenght = n * n, index = 1, row = n - 1, column = n - 1;
        int[][] arrResult = new int[n][n];
        int i = 0, j = 0;
        while (index <= lenght) {

            for (int k = j; k <= column; k++) {
                arrResult[i][k] = index++;
            }
            i++;

            for (int k = i; k <= row; k++) {
                arrResult[k][column] = index++;
            }
            column--;

            for (int k = column; k >= j; k--) {
                if (index >= lenght) {
                    break;
                }
                arrResult[row][k] = index++;
            }
            row--;

            for (int k = row; k >= i; k--) {
                arrResult[k][j] = index++;
            }
            j++;

        }
        return arrResult;
    }

    public static void main(String []as){
        int [][] arr = new Array17().getMatrixSprial(5);
        for(int i = 0; i< 5; ++i){
            for(int j = 0; j< 5; ++j){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
