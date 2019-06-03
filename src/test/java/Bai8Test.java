import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Bai8Test {
    @Test
    public void test_findFactorial(){
        assertEquals(new Bai8().findFactorial(3), new BigInteger("6"));
        assertEquals(new Bai8().findFactorial(30), new BigInteger("265252859812191058636308480000000"));
    }
}
