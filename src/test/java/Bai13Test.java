import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
public class Bai13Test {
    @Test
    public void test_tinhTongE() {
        assertEquals(new Bai13().tinhTongE(), 2.7182818011463845, 0.00001);
    }
}
