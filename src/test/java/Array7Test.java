import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array7Test {
    @Test
    public void test_getSubArrAscendingMax(){
        int[] arr = {2,4,5,1,2,4,5};
        int n = 7;
        assertEquals(new Array7().getSubArrAscendingMax(arr,n),"1 2 4 5");
    }
}
