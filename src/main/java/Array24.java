public class Array24 {
    public int findUCLN(int a, int b) {
        if (a * b == 0) {
            return a + b;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return findUCLN(a - b, b);
        }
        return findUCLN(a, b - a);
    }

    public int findBCNN(int a, int b) {
        return (a * b) / findUCLN(a, b);
    }

    public int getBCNNArray(int []arr){
        int result = findBCNN(arr[0],arr[1]);
        for(int i = 2; i< arr.length;++i){
            result = findBCNN(result,arr[i]);
        }
        return result;
    }
    public static void main(String []s){
        int []arr = {0,24,18};
        System.out.println(new Array24().getBCNNArray(arr));
    }
}
