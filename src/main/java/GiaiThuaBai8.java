public class GiaiThuaBai8 {

    public int layGiaiThuaCuaSo(int number) {
        if(number <= 0) {
            return 0;
        }
        int p = 1;
        for(int i = number; i>= 2; --i) {
            p *= i;
        }
        return p;
    }
}
