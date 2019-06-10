import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array14Test {
    @Test
    public void test_getArrayFromTwoDimensional(){
        int[][] arr = {
                {1,     2,      3,      4,      5},
                {6,     7,      8,      9,      10},
                {11,    12,     13,     14,     15}};
        int[] arrResult = {1,2,3,4,5,10,15,14,13,12,11,6,7,8,9};
        assertArrayEquals(new Array14().getArrayFromTwoDimensional(arr),arrResult);
    }

    @Test
    public void test_getArrayFromTwoDimensional23(){
        int[][] arr = {
                {1},
                {6},
                {6},
                {6},
                {6},
                {11}};
        int[] arrResult = {1,6,6,6,6,11};
        assertArrayEquals(new Array14().getArrayFromTwoDimensional(arr),arrResult);
    }

    @Test
    public void test_getArrayFromTwoDimensional2(){
        int[][] arr = {
                {1,      5},
                {6,      10},
                {6,      10},
                {11,     15}};
        int[] arrResult = {1,5,10,10,15,11,6,6};
        assertArrayEquals(new Array14().getArrayFromTwoDimensional(arr),arrResult);
    }

    @Test
    public void test_getArrayFromTwoDimensional22(){
        int[][] arr = {
                {1}};
        int[] arrResult = {1};
        assertArrayEquals(new Array14().getArrayFromTwoDimensional(arr),arrResult);
    }
}
