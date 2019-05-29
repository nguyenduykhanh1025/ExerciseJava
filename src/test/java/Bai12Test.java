import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai12Test {
    @Test
    public void test_findSumFollowFn() {
        assertEquals(new Bai12().findSumFollowFn(10), 2.7183, 0.001);
        assertEquals(new Bai12().findSumFollowFn(0), 1.0, 0.001);
    }
}
