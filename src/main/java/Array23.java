public class Array23 {

    public int getMaxSumConsecutive(int[] arr) {
        int sumMax = 0;
        int sumTemp = 0;
        for (int i = 0; i < arr.length; ++i) {

            if (arr[i] < 0) {
                sumMax = sumTemp>sumMax ? sumTemp : sumMax;
                sumTemp = 0;
            } else {
                sumTemp += arr[i];
            }
        }
        return sumMax;
    }

    public static void main(String[] s) {
        int[] arr = {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1};
        System.out.println(new Array23().getMaxSumConsecutive(arr));
    }
}
