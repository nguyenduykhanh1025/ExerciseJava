import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array5Test {
    @Test
    public void test_isPrimeNumber(){
        assertEquals(new Array5().isPrimeNumber(4),false);
        assertEquals(new Array5().isPrimeNumber(1),false);
        assertEquals(new Array5().isPrimeNumber(5),true);
    }
    @Test
    public void test_getSumPrimeNumberInArray(){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        assertEquals(new Array5().getSumPrimeNumberInArray(arr,n),10);
    }
}
