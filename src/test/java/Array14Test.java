import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array14Test {
    @Test
    public void test_getArrayFromTwoDimensional(){
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int m = 5, n = 3;
        int[] arrResult = {1,2,3,4,5,10,15,14,13,12,11,6,7,8,9};
        assertArrayEquals(new Array14().getArrayFromTwoDimensional(arr,m,n),arrResult);
    }
}
