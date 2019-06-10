import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array23Test {
    @Test
    public void test_getMaxSumConsecutive(){
        int[] arr = {0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1};
        assertEquals(new Array23().getMaxSumConsecutive(arr),18);
    }

}
