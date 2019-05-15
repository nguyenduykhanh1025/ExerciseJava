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

    public int find_BCNN(int a, int b) {
        int index = 0;
        boolean check = false;
        if(a > b) {
            index = a;
            check = false;
        }
        else {
            index = b;
            check = true;
        }
        int jump = 1;
        for(int i = index; ; i *= jump ) {
            if(check == false) {
                if(i % b == 0) {
                    return i;
                }
            }
            else {
                if(i % a == 0)
                {
                    return i;
                }
            }
            jump++;
        }
    }
}
