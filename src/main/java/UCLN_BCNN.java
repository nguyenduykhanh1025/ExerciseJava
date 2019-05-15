public class UCLN_BCNN {

    public int find_UCLN(int a, int b)
    {
        if (a*b == 0) {
            return a + b;
        }

        if (a == b){
           return a;
        }
        if(a > b){
            return find_UCLN(a - b, b);
        }
        return find_UCLN(a, b - a);
    }

    public int find_BCNN(int a, int b) {
        int index = 0;
        boolean check = false;
        if(a == b ){
            return a;
        }
        if(a > b) {
            index = a;
            check = false;
        }
        else{
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
