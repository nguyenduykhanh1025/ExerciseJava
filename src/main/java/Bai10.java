public class Bai10 {

    public double findPi() {
        double pi = 3;
        int i = 2;
        double valueNext = 4.0 / (i * (i + 1) * (i + 2));
        double distance = 3 - valueNext;
        while (distance >= 0.00001) {
            if (i % 4 != 0) {
                pi += valueNext;
            } else {
                pi -= valueNext;
            }
            i += 2;
            distance = valueNext - 4.0 / (i * (i + 1) * (i + 2));
            valueNext = 4.0 / (i * (i + 1) * (i + 2));
        }

        return (double) Math.round(pi * 100000) / 100000;
    }
}
