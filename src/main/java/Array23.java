public class Array23 {

    public int getMaxSumConsecutive(int[] arr) {
        int sumMax = 0;
        int sumTemp = 0;
        for (int i = 0; i < arr.length; ++i) {

            if (arr[i] < 0) {
                if (sumMax < sumTemp) {
                    sumMax = sumTemp;
                }
                sumTemp = 0;
            } else {
                sumTemp += arr[i];
            }
        }
        return sumMax;
    }

}
