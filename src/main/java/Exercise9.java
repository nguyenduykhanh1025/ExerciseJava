import java.text.DecimalFormat;

public class Exercise9 {

    public String getPi() {
        DecimalFormat df = new DecimalFormat("#.0000");
        double pi = 4;
        double old = pi;
       for (int i = 1; ; ++i)
       {
           if(i % 2 != 0){
               pi = pi - (4/(2*i + 1.0));
           }
           else{
               pi = pi + 4/(2*i + 1.0);
           }
           double ne = 4/(2*i + 1.0);

           if(old - ne <= 0.0001)
           {
               break;
           }
           old = ne;
       }

       return df.format(pi);
    }
}
