public class Bai3 {
    public String phanTichThuaSoNguyenTo(int number){
        StringBuffer strResult = new StringBuffer("");
        if(number == 1){
            return "1";
        }
        if(number == 0){
            return "0";
        }
        int jumbNumber = 2;
        while (number != 1){
            if(number % jumbNumber == 0){
                strResult.append(jumbNumber + "*");
                number/=jumbNumber;
            }
            else {
                jumbNumber++;
            }
        }
        int lenString = strResult.length();
        return strResult.delete(lenString - 1, lenString).toString();
    }
    public static void main(String []ar){
    }
}