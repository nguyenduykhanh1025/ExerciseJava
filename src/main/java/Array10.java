public class Array10 {

    public String splitN(int[] arr, int n) {
        int lenght = arr.length;
        StringBuffer strResult = new StringBuffer("");
        for (int i = 1; i <= lenght; ++i) {
            strResult.append(arr[i - 1] + " ");
            if (i % n == 0) {
                System.out.println("day " + i);
                strResult.append(" ");
            }
        }
        return strResult.toString().trim();
    }
}
