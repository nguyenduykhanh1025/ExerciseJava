public class UCLN_BCNN {
    public int find_UCLN(int a, int b) {
        if(a < 0) {
            a = Math.abs(a);
        }
        if(b < 0) {
            b = Math.abs(b);
        }
        if(a < b) {
            for(int i = a; i >= 1; --i) {
                if(a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
        else if(b < a) {
            for(int i = b; i >= 1; --i) {
                if(a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
        return a;
    }
}
