public class Bai3 {
    public String phanTichThuaSoNguyenTo(int number) {
        StringBuffer strResult = new StringBuffer("");
        if (number <= 2) {
            return "" + number;
        }
        int jumbNumber = 2;
        while (number != 1) {
            if (number % jumbNumber == 0) {
                strResult.append(jumbNumber);
                number /= jumbNumber;
                if (number != 1) {
                    strResult.append("*");
                }
            } else {
                jumbNumber++;
            }
        }
        return strResult.toString();
    }
}