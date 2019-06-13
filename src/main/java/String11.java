import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class String11 {

    public boolean isNaN(char i){
        if(i >= 48 && i <= 57){
            return true;
        }
        return false;
    }


    public double getResultFx(String fx){
        int jump = 0;
        for(int i = 0; i< fx.length(); ++i){
            if(!isNaN(fx.charAt(i))){
                jump = i;
            }
        }
        return 0;
    }

    public static void main(String []ss){
        //String s = "+";
        String s = "2+3";
        System.out.println(new String11().getResultFx(s));
    }
}
