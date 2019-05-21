import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Bai12Test {
    @Test
    public void test_getResult() {
        assertEquals(new Bai12().getSumS(3), 2.708333333333333, 0.000001);
        assertEquals(new Bai12().getSumS(15), 2.718281830583527, 0.000001);
    }
}
