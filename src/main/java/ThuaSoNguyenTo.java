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
        int i = 2;
        while (number != 1){
            if(number % i == 0) {
                arr[index++] = i;
                number /= i;
                }
            else
            {
                i++;
            }
        }
        String strResurt = "";
        for(int j = 0; j< index - 1; ++j) {
            strResurt = strResurt + arr[j] + "*";
        }
        strResurt = strResurt + arr[index - 1];

        return strResurt;

    }
}
