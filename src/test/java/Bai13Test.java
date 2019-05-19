import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
public class Bai13Test {
    @Test
    public void test_tinhTongE() {
        assertEquals(new Bai13().tinhTongE(), "2.718282");
    }
    @Test
    public void test_layGiaThua() {
        assertEquals(new Bai13().layGiaThua(3), new BigInteger("6"));
        assertEquals(new Bai13().layGiaThua(1), new BigInteger("1"));
        assertEquals(new Bai13().layGiaThua(100), new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"));
    }
}
