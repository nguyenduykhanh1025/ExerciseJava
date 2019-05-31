import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai9Test {
    @Test
    public void test_findPi() {
        assertEquals(new Bai9().findPi(), 3.1346, 0.0001);
    }

    public void test_findFn() {
        assertEquals(new Bai9().findFn(1), 1.3333333333333333, 0.0001);
        assertEquals(new Bai9().findFn(0), 4.0, .0001);
    }
}
