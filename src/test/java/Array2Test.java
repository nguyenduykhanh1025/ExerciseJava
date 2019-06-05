import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array2Test {
    @Test
    public void test_sumOfThreeNumberMax(){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        assertEquals(new Array2().sumOfThreeNumberMax(arr,n),12);
    }
}
