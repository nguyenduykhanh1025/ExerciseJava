import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Bai12Test {
    @Test
    public void test_getResult() {

        assertEquals(new Bai12().getResult(3), "2.66667");
        assertEquals(new Bai12().getResult(65), "2.71828");
    }

    @Test
    public void test_layGiaThua() {

        assertEquals(new Bai12().layGiaThua(65), new BigInteger("8247650592082470666723170306785496252186258551345437492922123134388955774976000000000000000"));
    }
}
