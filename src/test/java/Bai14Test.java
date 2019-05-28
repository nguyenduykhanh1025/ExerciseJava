import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai14Test {
    @Test
    public void test_findSqrt(){
        assertEquals(new Bai14().findSqrt(2), 1.4142135623746899,0.0001);
        assertEquals(new Bai14().findSqrt(3), 1.7320508100147274,0.0001);
    }
}
