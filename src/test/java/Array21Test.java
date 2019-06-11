import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array21Test {
    @Test
    public void test_getDeterminantMatrix2() {
        int[][] arr = {
                {1, 9, 3, 4},
                {5, 6, 7, 9},
                {3, 10, 11, 12},
                {13, 2, 5, 3}
        };

        assertEquals(new Array21().getDeterminantMatrix(arr), 1598, 0.001);
    }

    @Test
    public void test_getDeterminantMatrix3() {
        int[][] arr = {
                {4, 11, 28, 3, 9, 1},
                {2, 2, 4, 28, 2, 14},
                {6, 3, 9, 17, 18, 7},
                {3, 3, 1, 16, 6, 15},
                {6, 5, 3, 2, 9, 23},
                {1, 6, 11, 2, 19, 16}
        };

        assertEquals(new Array21().getDeterminantMatrix(arr), -2399168, 0.001);
    }

    @Test
    public void test_getDeterminantMatrix4() {
        int[][] arr = {
                {30, 2, 69, 35, 66},
                {8, 32, 52, 59, 11},
                {87, 41, 97, 39, 79},
                {15, 94, 77, 25, 98},
                {36, 23, 20, 8, 83}
        };

        assertEquals(new Array21().getDeterminantMatrix(arr), 947285424, 0.1);
    }

    @Test
    public void test_getDeterminantMatrix5() {
        int[][] arr = {
                {76, 99, 85},
                {54, 25, 56},
                {33, 9, 73}
        };

        assertEquals(new Array21().getDeterminantMatrix(arr), -135725, 0.1);
    }
}
