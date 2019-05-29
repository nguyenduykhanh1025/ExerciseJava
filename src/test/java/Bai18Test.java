import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai18Test {
    @Test
    public void test_convertDecimalToBinaryNumberReverse() {
        assertEquals(new Bai18().convertDecimalToBinaryNumberReverse(35), 110001);
    }

    @Test
    public void test_covertBinaryToDecumalNumber() {
        assertEquals(new Bai18().covertBinaryToDecumalNumber(110001), 49);
    }

    @Test
    public void test_getNumberReverseFromCovertBinary() {
        assertEquals(new Bai18().getNumberReverseFromCovertBinary(35), 49);
    }
}
