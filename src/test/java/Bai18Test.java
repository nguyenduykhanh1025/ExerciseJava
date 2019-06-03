import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai18Test {

    @Test
    public void test_convertDecimalToBinaryNumber(){
        assertEquals(new Bai18().convertDecimalToBinaryNumber(123),1111011);
    }

    @Test
    public void test_covertDecimalToDecimalreserve(){
        assertEquals(new Bai18().covertDecimalToDecimalreserve(23),29);
    }
}
