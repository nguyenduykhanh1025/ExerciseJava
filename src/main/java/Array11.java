public class Array11 {

    public int[] getArrayReverseEvenOdd(int[] arr, int n) {

        int indexOdd = n - 1, indexEven = n - 1;

        for (int i = 0; i <= n / 2; ++i) {
            if (arr[i] % 2 == 0) {
                for (int j = indexOdd; j >= n / 2; --j) {
                    if (arr[j] % 2 == 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        indexOdd = j - 1;
                        break;
                    }
                }
            } else {
                for (int j = indexEven; j >= n / 2; --j) {
                    if (arr[j] % 2 != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        indexEven = j - 1;
                        break;
                    }
                }
            }
        }
        return arr;
    }

}
