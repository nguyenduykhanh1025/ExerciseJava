public class Array21 {

    public double getDeterminantMatrix(float[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for(int index = 0; index < row - 1; ++index){
            for(int i = 1 + index; i< row; ++i){
                float temp = arr[i][index] / arr[index][index];

                for(int j = index; j< column; ++j){
                    arr[i][j] = arr[i][j] - temp*arr[index][j];
                }
            }
        }

        float result = 1;
        for(int i = 0; i< row; ++i){
            for(int j = 0; j< column; ++j){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
        for(int i = 0; i< row; ++i){
            result *= arr[i][i];
        }
        return result;
    }

    public static void main(String []s){
        float[][] arr = {
                {4, 11, 28, 3, 9, 1},
                {2, 2, 4, 28, 2, 14},
                {6, 3, 9, 17, 18, 7},
                {3, 3, 1, 16, 6, 15},
                {6, 5, 3, 2, 9, 23},
                {1, 6, 11, 2, 19, 16}
        };

        System.out.println(new Array21().getDeterminantMatrix(arr));
    }

}
