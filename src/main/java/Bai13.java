import java.text.DecimalFormat;

public class Bai13 {

    public int layGiaThua(int n)
    {
        if(n<=1){
            return 1;
        }
        int p = 1;
        for(int i = 2; i<=n; ++i) {
            p = p*i;
        }
        return p;
    }
    public String getResurt(){
        DecimalFormat df = new DecimalFormat("#.000000");
        double resurt = 2.0;
        double old = resurt;
        for(int i = 2;;i++)
        {
            resurt += 1.0/layGiaThua(i);
            double ne = 1.0/layGiaThua(i);
            if(old - ne <= 0.00001)
            {
                break;
            }
            old = ne;

        }
        return df.format(resurt);
    }
}
