import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array3Test {
    @Test
    public void test_findMinusOfSumEvenNumberWithSumOddNumber(){
        int []arr = {1,2,3,4,5};
        int n = 5;
        assertEquals(new Array3().findMinusOfSumEvenNumberWithSumOddNumber(arr,n),-3);
    }
}
