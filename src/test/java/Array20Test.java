import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array20Test {
    @Test
    public void test_getSubMatrix(){
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][]arrResult = null;
        assertArrayEquals(new Array20().getSubMatrix(arr,2,1,3,3),null);
    }

    @Test
    public void test_getSubMatrix1(){
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][]arrResult = {   {2,3,4},
                                {5,6,7},
                                {8,9,10}   };
        assertArrayEquals(new Array20().getSubMatrix(arr,0,1,3,3),arrResult);
    }
}
