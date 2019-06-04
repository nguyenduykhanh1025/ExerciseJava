import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array6Test {

    @Test
    public void test_insert(){
        int []arr = {1,2,3,4,5};
        int []arrResut = {5,1,2,3,4};
        assertArrayEquals(new Array6().insert(arr,4,0),arrResut);
    }

    @Test
    public void test_sortArray(){
        int[] arr = {7,10,8,5,0,14,2};
        int n = 7;
        int []arrResult = {7,0,2,8,10,5,14};
        assertArrayEquals(new Array6().sortArray(arr,n),arrResult);
    }
}
