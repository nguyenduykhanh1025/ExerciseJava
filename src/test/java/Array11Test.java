import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array11Test {
    @Test
    public void test_getArrayReverseEvenOdd(){
        int []arr= {1,2,4,5,6,7,8,10};
        int n = 8;
        int []result = {7,10,8,5,6,1,4,2};
        assertArrayEquals(new Array11().getArrayReverseEvenOdd(arr,n),result);
    }
}
