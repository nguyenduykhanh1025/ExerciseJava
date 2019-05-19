public class Exercise9 {

    public String getPi() {

        String str;
        double pi = 4, ne = 0;
        double old = pi;
        int i = 1;

        do {
            pi = pi - (4 / (2 * i + 1.0));
            old = 4 / (2 * i++ + 1.0);

            pi = pi + 4 / (2 * i + 1.0);
            ne = 4 / (2 * i++ + 1.0);
        } while (old - ne > 0.0001);
        System.out.println("adsasd");
        return String.format("%.4f", pi);
    }
}
