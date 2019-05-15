import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FibonaciTest {
    @Test
    public void test_getFibonaci() {
        assertEquals((new Fibonaci().getFibonaci(8).toString()), "1 1 2 3 5 8");
    }
}
