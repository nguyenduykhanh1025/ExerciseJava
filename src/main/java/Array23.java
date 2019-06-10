public class Array23 {

    public int getMaxSumConsecutive(int[] arr) {
        int sumMax = 0;
        int sumTemp = 0;
        for (int i = 0; i <= arr.length; ++i) {

            if (i == arr.length || arr[i] < 0) {
                System.out.println("adu " + sumTemp);
                sumMax = sumTemp>sumMax ? sumTemp : sumMax;
                sumTemp = 0;
            } else {
                sumTemp += arr[i];
            }
        }
        return sumMax;
    }
}
