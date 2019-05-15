public class GiaiThuaBai8 {

    public int layGiaiThuaCuaSo(int number) {
        if(number <= 0) {
            return 1;
        }
        int p = 1;
        for(int i = 2; i<= number; ++i) {
            p *= i;
        }
        return p;
    }
}
