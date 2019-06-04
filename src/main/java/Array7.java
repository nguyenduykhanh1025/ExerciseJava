public class Array7 {

    public String getSubArrAscendingMax(int[] arr, int n) {
        StringBuffer strResult = new StringBuffer("");
        StringBuffer strTemp = new StringBuffer("");
        int maxDem = 0;
        for (int i = 0; i < n; ++i) {
            int dem = 0;
            strTemp.append(arr[i] + " ");
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] > arr[j]) {
                    break;
                }
                strTemp.append(arr[j] + " ");
                dem++;
            }
            if (dem > maxDem) {
                maxDem = dem;
                strResult = strTemp;
            }
            strTemp = new StringBuffer("");
        }
        return strResult.toString().trim();
    }
}
