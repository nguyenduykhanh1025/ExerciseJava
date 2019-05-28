public class Bai4 {
    public String phanTichThuaSoNguyenTo(int number) {
        StringBuffer strResult = new StringBuffer("");
        if (number <= 2) {
            return "" + number;
        }
        int jumpNumber = 2, countOfJumpNumber = 0;
        while (number != 1) {
            if (number % jumpNumber == 0) {
                countOfJumpNumber++;
                number /= jumpNumber;
                if (number % jumpNumber != 0) {
                    strResult.append(jumpNumber + "^" + countOfJumpNumber);
                    if (number != 1) {
                        strResult.append("+");
                    }
                    countOfJumpNumber = 0;
                }
            } else {
                jumpNumber++;
            }
        }
        return strResult.toString();
    }
}
