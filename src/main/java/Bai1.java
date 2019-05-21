public class Bai1 {

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

}
