import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai2Test {
    @Test
    public void test_getNumberZeroFromFactorial() {
        assertEquals(new Bai27().getNumberZeroFromFactorial(5), 1);
        assertEquals(new Bai27().getNumberZeroFromFactorial(10000), 2499);
    }
}
