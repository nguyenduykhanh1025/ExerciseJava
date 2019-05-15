import java.lang.reflect.Array;

public class ThuaSoNguyenTo {

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
        do {
            for(int i = 2; i <= number; i++) {
                if(number % i == 0) {
                    arr[index++] = i;
                    number /= i;
                    break;
                }
            }
        }while (number > 1);
        String strResurt = "";
        for(int i = 0; i< index - 1; ++i) {
            strResurt = strResurt + arr[i] + "*";
        }
        strResurt = strResurt + arr[index - 1];

        return strResurt;

    }

}
