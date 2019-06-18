public class String11 {

    public double getResultFx(String fx) {

        int i = 0;
        while (Character.isDigit(fx.charAt(i))) {
            i++;
        }

        StringBuffer sign = new StringBuffer();
        sign.append(fx.charAt(i));
        if (!Character.isDigit(fx.charAt(i + 1))) {
            sign.append(fx.charAt(i + 1));
        }

        StringBuffer regex = new StringBuffer("\\");
        regex.append(sign);
        String[] number = fx.split(regex.toString());

        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);

        if (sign.toString().equals("+")) {

            return a + b;
        }
        if (sign.toString().equals("-")) {
            return a - b;
        }
        if (sign.toString().equals("*")) {
            return a * b;
        }
        if (sign.toString().equals("/")) {
            return (a * 1.0) / b;
        }
        if (sign.toString().equals("<<")) {
            return a << b;
        }
        return a >> b;
    }
}

