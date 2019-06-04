import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array10Test {
    @Test
    public void test_splitN(){
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        assertEquals(new Array10().splitN(arr,n),"1 2 3  4 5");
    }
}
