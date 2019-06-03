public class Array5 {

    public boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getSumPrimeNumberInArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            if (isPrimeNumber(arr[i]))
                sum += arr[i];
        }
        return sum;
    }
}
