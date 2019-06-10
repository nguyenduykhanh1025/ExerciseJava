import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array19Test {
    @Test
    public void test_sortMatrixFollowSpiral() {
        int[][] arr = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}};
        int[][] arrResult = {   {1, 2, 3, 4, 5},
                                {12, 13, 14, 15, 6},
                                {11, 10, 9, 8, 7}   };
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrixFollowSpiral2() {
        int[][] arr = { {1, 2},
                {6, 7},
                {11, 12}};
        int[][] arrResult = {{1,2},{12,6},{11,7}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrix() {
        int[][] arr = { {1, 2, 3, 4, 5},
                        {12, 13, 14, 15, 6},
                        {11, 10, 9, 8, 7}   };
        int[][] arrResult = {   {1, 2, 3, 4, 5},
                                {6, 7, 8, 9, 10},
                                {11, 12, 13, 14, 15}    };

        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrix(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_getMatrixSpiral() {
        int[][] arrResult = {   {1, 2, 3, 4, 5},
                                {12, 13, 14, 15, 6},
                                {11, 10, 9, 8, 7}   };
        int[][] arr = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15} };
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().getMatrixSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_getMatrixSpiral2() {
        int[][] arr = { {1, 2},
                {6, 7},
                {11, 12}};
        int[][] arrResult = {{1,2},{12,6},{11,7}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().getMatrixSpiral(arr)[i], arrResult[i]);
        }
    }
}
