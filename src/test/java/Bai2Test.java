import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai2Test {
    @Test
    public void test_findSumOfNumber(){
        assertEquals(new Bai2().findSumOfNumber(123),6);
        assertEquals(new Bai2().findSumOfNumber(0),0);
    }
}
