public class Bai11 {

    public double tinhLaiLuyTien(int n) {
        double origin = 100;
        return (double) Math.round(origin * Math.pow(1 + 1.0 / n, n)*1000)/1000;
    }
}
