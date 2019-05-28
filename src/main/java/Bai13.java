public class Bai13 {

    public double findE() {
        double valueOfENext, e = 1;
        int i = 1, factorial = 1;
        do {
            e += 1.0 / factorial;
            factorial *= ++i;
            valueOfENext = e + 1.0 / factorial;
        } while (valueOfENext - e > 0.00001);
        return e;
    }
}
