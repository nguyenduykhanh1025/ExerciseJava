import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class Array27Test {

    @Test
    public void test_sortArray(){
        int []arr = {6,5,4,7,2,1};
        int []arrResult = {1,2,4,5,6,7};
        assertArrayEquals(new Array27().sortArray(arr),arrResult);
    }

    @Test
    public void test_getListMax(){
        int []arr = {6,5,4,7,2,1};
        int []arrResult = {7,6,5};
        int k = 3;
        assertArrayEquals(new Array27().getListMax(arr,k),arrResult);
    }

}
