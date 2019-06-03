public class Bai14 {

    public double findSqrt(float a) {
        double fn = a, fnOld;
        do {
            fnOld = fn;
            fn = a / (2.0 * fn) + fn / 2.0;
        } while (fnOld - fn >= 0.0001);
        return fn;
    }
}
