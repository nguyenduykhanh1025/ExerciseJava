public class Bai9 {

    public double findPi() {
        double pi = 4;
        int i = 1;
        double distanceOfPi = 4 - 4.0 / (2 * i + 1);
        while (distanceOfPi >= 0.0001) {
            if(i % 2 != 0){
                pi -= 4.0/(2*i + 1);
            }
            else{
                pi += 4.0/(2*i + 1);
            }
            i++;
            distanceOfPi = 4.0/(2*(i - 1) + 1) - 4.0/(2*i + 1);
        }
        return (double)Math.round(pi*10000)/10000;
    }
}
