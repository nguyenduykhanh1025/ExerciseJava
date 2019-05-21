
public class Bai12 {

    public Double getSumS(int n) {
        double result = 1.0, resultOld = 0;
        int i = 0, pre = 1;
        do {
            if (i != 0) {
                resultOld = result;
            }
            i++;
            pre = pre * i;
            result += Math.pow(pre, -1.0);
        } while (i <= n);
        return result;
    }
}
