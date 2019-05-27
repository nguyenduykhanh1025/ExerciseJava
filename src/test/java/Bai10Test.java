import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai10Test {
    @Test
    public void test_findPi(){
        assertEquals(new Bai10().findPi(), 3.14162, 0.0001);
    }
}
