public class Bai10 {

    public double findFn(int i) {
        return 4.0 / (i * (i + 1) * (i + 2));
    }

    public double findPi() {
        double pi = 3;
        int i = 2;

        double distance = 3;

        while (distance >= 0.00001) {

            distance = findFn(i);

            if (i % 4 != 0) {
                pi += distance;
            } else {
                pi -= distance;
            }
            i += 2;
        }

        return pi;
    }
}
