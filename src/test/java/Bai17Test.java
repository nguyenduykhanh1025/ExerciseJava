import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai17Test {
    @Test
    public void test_isNumberHaveSumExponential(){
        assertEquals(new Bai17().isNumberHaveSumExponential(153), true);
        assertEquals(new Bai17().isNumberHaveSumExponential(135), false);
    }
}
