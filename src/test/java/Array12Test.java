import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array12Test {
    @Test
    public void test_getInsert(){
        int []arr = {1,2,4,5};
        int []arrResult = {1,2,3,4,5};
        assertArrayEquals(new Array12().getInsert(arr,2,3),arrResult);
    }

    @Test
    public void test_getInsertArrayAscending(){
        int []arr = {1,2,4,5};
        int []arrResult = {1,2,3,4,5};
        int []arrResult1 = {-1,1,2,4,5};
        int []arrResult2 = {1,2,4,5,6};
        int []arrResult3 = {1,1,2,4,5};
        int []arrResult4 = {1,2,4,5,5};
        assertArrayEquals(new Array12().getInsertArrayAscending(arr,3,0,4), arrResult);
        assertArrayEquals(new Array12().getInsertArrayAscending(arr,-1,0,4), arrResult1);
        assertArrayEquals(new Array12().getInsertArrayAscending(arr,6,0,4), arrResult2);
        assertArrayEquals(new Array12().getInsertArrayAscending(arr,1,0,4), arrResult3);
        assertArrayEquals(new Array12().getInsertArrayAscending(arr,5,0,4), arrResult4);
    }

}
