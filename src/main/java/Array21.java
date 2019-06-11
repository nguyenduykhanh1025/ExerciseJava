public class Array21 {

    public int[][] getSubMatrix(int[][] arr, int xRow, int yColunm) {
        int[][] arrResult = new int[arr.length - 1][arr[0].length - 1];
        return arrResult;
    }
    public int check(int n){
        if(n % 2 == 0){
            return 1;
        }
        return -1;
    }
    public int getDeterminantMatrix(float[][] arr) {
        for(int i = 0; i< arr.length; ++i){
            return check(i)*arr[i][0]*getDeterminantMatrix(getSubMatrix())
        }
    }

    public static void main(String []s){
        int[][] arr = {
                {4, 11, 28, 3, 9, 1},
                {2, 2, 4, 28, 2, 14},
                {6, 3, 9, 17, 18, 7},
                {3, 3, 1, 16, 6, 15},
                {6, 5, 3, 2, 9, 23},
                {1, 6, 11, 2, 19, 16}
        };
        int [][]arrResult = new Array21().getSubMatrix(arr,1,1,2,2);
        //System.out.println(new Array21().getDeterminantMatrix(arr));
        for(int i = 0; i< arrResult.length; ++i){
            for(int j = 0; j< arrResult[0].length; ++j){
                System.out.print(arrResult[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
