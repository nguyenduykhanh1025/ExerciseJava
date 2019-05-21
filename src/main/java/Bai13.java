
public class Bai13 {

    public double tinhTongE() {
        double result = 1.0, resultOld = 0;
        int i = 0, pre = 1;
        do {
            if (i != 0) {
                resultOld = result;
            }
            i++;
            pre = pre * i;
            result += Math.pow(pre, -1.0);
        } while (result - resultOld > 0.000001);
        return result;
    }
}
