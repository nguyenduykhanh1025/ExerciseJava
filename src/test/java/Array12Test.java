import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array12Test {
    @Test
    public void test_insertInArray() {
        int[] arr = {1, 2, 4, 5};
        int[] arrResult = {1, 2, 3, 4, 5};
        assertArrayEquals(new Array12().insertInArray(arr, 2, 3), arrResult);
    }

    @Test
    public void test_getInsertArrayAscending() {
        int[] arr = {1, 2, 4, 5};
        int[] arrResult = {1, 2, 3, 4, 5};
        assertArrayEquals(new Array12().getInsertArrayAscending(arr, 3), arrResult);
    }

}
