public class Array13 {

    public int[][] rotateArray90Degrees(int [][]arr, int n, int m){
        int [][]result = new int[n][m];
        for(int i = 0; i< n; ++i){
            int k = m - 1;
            for(int j = 0; j< m; ++j){
                result[i][j]=arr[k][i];
                k--;
            }
        }
        return result;
    }

    public static void main(String []s){
        int [][]arr = {{1,2},{3,4}};
        int n = 2,m = 2;
        int [][]result = new Array13().rotateArray90Degrees(arr,n,m);
        for(int i= 0; i< n; ++i){
            for(int j = 0; j<m; ++j){
                System.out.print(result[i][j]  + " " );
            }
            System.out.println(" ");
        }

    }
}
