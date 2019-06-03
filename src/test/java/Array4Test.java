import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array4Test {
    @Test
    public void test_sortArray(){
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayresult = {4, 2, 1, 3, 5};
        int n = 5;
        assertArrayEquals(new Array4().sortArray(array,n),arrayresult);
    }
}
