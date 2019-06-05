import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array6Test {

    @Test
    public void test_sortArray(){
        int[] arr = {7,10,1,8,5,0,14,2};
        int n = 8;
        int []arrResult = {7,0,5,2,1,8,10,14};
        assertArrayEquals(new Array6().sortArr(arr,n),arrResult);
    }
}
