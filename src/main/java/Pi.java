import java.text.DecimalFormat;

public class Pi {

    public String getPi()
    {
        DecimalFormat df = new DecimalFormat("#.00000");
        double pi = 3;
        double old = pi;
        for (int i = 2; ; i+=2)
        {
            if(i % 4 != 0){
                pi = pi + (4.0/(i*(i + 1)*(i + 2)));
            }
            else{
                pi = pi - 4.0/(i*(i + 1)*(i + 2));
            }
            double ne = 4/(2*i + 1.0);

            if(old - ne <= 0.00001)
            {
                break;
            }
            old = ne;
        }

        return df.format(pi);
    }

}
