import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array8Test {
    @Test
    public void test_getMinusOfMaxWithMinNumber() {
        int[] arr = {13, 2, 1, 4, 5};
        int n = 5;
        assertEquals(new Array8().getMinusOfMaxWithMinNumber(arr,n),12);
    }
}
