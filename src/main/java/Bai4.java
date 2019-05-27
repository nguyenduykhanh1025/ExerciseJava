public class Bai4 {
    public String phanTichThuaSoNguyenTo(int number) {
        StringBuffer strResult = new StringBuffer("");
        if (number == 1) {
            return "1";
        }
        if (number == 0) {
            return "0";
        }
        int jumpNumber = 2, countOfJumpNumber = 0;
        while (number != 1) {
            if (number % jumpNumber == 0) {
                countOfJumpNumber++;
                number /= jumpNumber;

                // this is final that number % jumpNumber == 0
                if (number % jumpNumber != 0) {
                    strResult.append(jumpNumber + "^" + countOfJumpNumber + "+");
                    countOfJumpNumber = 0;
                }
            } else {
                jumpNumber++;
            }
        }
        int lenString = strResult.length();
        return strResult.delete(lenString - 1, lenString).toString();
    }
}
