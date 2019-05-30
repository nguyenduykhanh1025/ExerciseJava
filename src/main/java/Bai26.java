public class Bai26 {

    public int getFibonaciCrazyAtN(int n, int[] arrNumberFirst) {

        int[] arrFibonaci = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            if (i <= 4) {
                arrFibonaci[i] = arrNumberFirst[i];
            } else {
                int j = i - 1, count = 1;
                arrFibonaci[i] = 0;
                while (count <= 5) {
                    arrFibonaci[i] += arrFibonaci[j--];
                    count++;
                }
                arrFibonaci[i] %= 10;
            }
        }

        return arrFibonaci[n - 1];
    }
}
