public class Bai10 {

    public double findFn(int i) {
        return 4.0 / (i * (i + 1) * (i + 2));
    }

    public double findPi() {
        double pi = 3;
        int i = 2;
        double valueNext = findFn(i);
        double distance = 3 - valueNext;
        while (distance >= 0.00001) {
            if (i % 4 != 0) {
                pi += valueNext;
            } else {
                pi -= valueNext;
            }
            i += 2;
            distance = valueNext - findFn(i);
            valueNext = findFn(i);
        }

        return pi;
    }
}
