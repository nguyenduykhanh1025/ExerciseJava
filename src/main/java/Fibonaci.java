public class Fibonaci {

    public StringBuffer getFibonaci(int number) {

        StringBuffer str = new StringBuffer();
        int a = 1, b = 1;
        str = str.append(a + " " + b);
        while((a + b) <= number) {
            int temp = a;
            a = b;
            b = temp + b;

            str.append(" " + b);
        }
        return str;
    }
}
