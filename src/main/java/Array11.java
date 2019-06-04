public class Array11 {

    public int[] getArrayReverseEvenOdd(int[] arr, int n) {

        int indexOdd = n - 1, indexEven = n - 1;

        for (int i = 0; i <= n / 2; ++i) {
            for (int j = (arr[i] % 2 == 0) ? indexEven : indexOdd; j >= 0; --j) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && j <= indexEven) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    indexEven = j - 1;
                    break;
                }
                if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && j <= indexOdd) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    indexOdd = j - 1;
                    break;
                }
            }
        }
        return arr;
    }

}
