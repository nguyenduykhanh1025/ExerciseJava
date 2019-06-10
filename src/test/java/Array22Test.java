import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array22Test {

    @Test
    public void test_getSubMatrix() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = arr.length;
        int x = 1;
        int y = 0;
        int[][] arrResult = {{2, 3}, {8, 9}};
        int[][] actuallResult = new Array22().getSubMatrix(arr, 1, 0);

        assertArrayEquals(arrResult, actuallResult);
    }
}
