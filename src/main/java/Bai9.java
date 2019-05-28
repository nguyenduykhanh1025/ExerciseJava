public class Bai9 {

    public double findFn(int i) {
        return 4.0 / (2 * i + 1);
    }

    public double findPi() {
        double pi = 4;
        int i = 1;
        double distanceOfPi = findFn(0) - findFn(i);
        while (distanceOfPi >= 0.0001) {
            if (i % 2 != 0) {
                pi -= 4.0 / (2 * i + 1);
            } else {
                pi += 4.0 / (2 * i + 1);
            }
            i++;
            distanceOfPi = findFn(i - 1) - findFn(i);
        }
        return (double) Math.round(pi * 10000) / 10000;
    }
}
