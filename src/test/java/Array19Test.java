import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array19Test {
    @Test
    public void test_sortMatrixFollowSpiral() {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        int[][] arrResult = {{1, 2, 3, 4, 5},
                {12, 13, 14, 15, 6},
                {11, 10, 9, 8, 7}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrixFollowSpiral2() {
        int[][] arr = { {1, 2, 3, 4},
                        {6, 7, 8, 9} };
        int[][] arrResult = {   {1, 2, 3, 4},
                                {9, 8, 7, 6}    };
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrixFollowSpiral3() {
        int[][] arr = {
                {1},
                {6},
                {6},
                {6},
                {6},
                {11}};
        int[][] arrResult = {
                {1},
                {6},
                {6},
                {6},
                {6},
                {11}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrixFollowSpiral4() {
        int[][] arr = { {1, 2},
                        {3, 4},
                        {5, 6} };
        int[][] arrResult = {   {1, 2},
                                {6, 3},
                                {5, 4}  };
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrixFollowSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_sortMatrix() {
        int[][] arr = {{1, 2, 3, 4, 5},
                {12, 13, 14, 15, 6},
                {11, 10, 9, 8, 7}};
        int[][] arrResult = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().sortMatrix(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_getMatrixSpiral() {
        int[][] arrResult = {{1, 2, 3, 4, 5},
                {12, 13, 14, 15, 6},
                {11, 10, 9, 8, 7}};
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().getMatrixSpiral(arr)[i], arrResult[i]);
        }
    }

    @Test
    public void test_getMatrixSpiral2() {
        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8} };
        int[][] arrResult = {{1, 2, 3, 4},
                            {8, 7, 6, 5}};
        for (int i = 0; i < arr.length; ++i) {
            assertArrayEquals(new Array19().getMatrixSpiral(arr)[i], arrResult[i]);
        }
    }
}
