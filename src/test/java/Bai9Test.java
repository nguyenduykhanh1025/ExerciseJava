import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai9Test {
    @Test
    public void test_findPi(){
        assertEquals(new Bai9().findPi(), 3.1346, 0.0001);
    }
}
