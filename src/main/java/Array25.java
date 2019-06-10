public class Array25 {

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

    public int getUCNNArray(int[] arr) {
        int result = 0;
        int temp = findUCLN(arr[0], arr[1]);
        for (int i = 2; i < arr.length; ++i) {
            temp = findUCLN(temp, arr[i]);
        }
        return temp;
    }

}
