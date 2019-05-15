import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.DecimalFormat;

public class Bai12 {

    public int layGiaThua(int n) {

        if(n <= 1) {
            return 1;
        }
        int p = 1;
        for(int i = 2; i<= n; ++i) {
            p*=i;
        }
        return p;
    }
    public String getResurt(int n) {
        DecimalFormat df = new DecimalFormat("#.00000");
        double p = 0.0;
       for(int i = 0; i<=n; ++i) {
           p += (1.0/layGiaThua(i));
       }
       return df.format(p);
    }
}
