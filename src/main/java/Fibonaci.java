public class Fibonaci {

    public String getFibonaci(int number) {
        String str = "";
        int a = 1, b = 1;
        str = str + a + " " + b;
        while((a + b) <= number) {
            int temp = a;
            a = b;
            b = temp + b;

            str = str + " " + b;
        }
        return str;
    }
}
