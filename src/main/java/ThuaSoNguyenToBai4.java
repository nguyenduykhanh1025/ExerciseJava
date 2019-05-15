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
        if(number < 2)
        {
            return "";
        }
        int[] arr = new int[200];
        int index = 0;
        int x = 2;
        while (number != 1){
            if(number % x == 0) {
                arr[index++] = x;
                number /= x;
            }
            else
            {
                x++;
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
