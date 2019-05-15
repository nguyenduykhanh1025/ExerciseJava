public class ThuaSoNguyenToBai4 {
    public int getSampleOfNumberInArr(int arr[], int len, int number) {
        int sum = 0;
        for(int i= 0; i< len; ++i) {
            if(arr[i] == number)
                sum++;
        }
        return sum;
    }

    public String phanTichThuaSoNguyenTo(int number) {
        int arr[] = new int[200];
        int index = 0;
        while (number != 1) {
            for(int i = 2; i <= number; i++) {
                if(number % i == 0) {
                    //System.out.print(i + "*");
                    arr[index++] = i;
                    number /= i;
                    break;
                }
            }
        }

        String strResurt = "";
        for(int i = 0; i< index; ++i) {

            // check da co trc do chua
            boolean check = false;
            for(int j = i - 1; j>= 0; --j) {
                if(arr[i] == arr[j]) {
                    // da check qua roi
                    check = true;
                    break;
                }
            }
            if(check == false || i == 0) {
                strResurt = strResurt + arr[i] + "^" + getSampleOfNumberInArr(arr,index,arr[i]) + "*";
            }
        }
        strResurt = strResurt.substring(0, strResurt.length() - 1);
        return  strResurt;
    }

}
