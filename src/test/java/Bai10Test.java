import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai10Test {
    @Test
    public void test_findPi(){
        assertEquals(new Bai10().findPi(), 3.14159, 0.00001);
    }
    @Test
    public void test_findFn(){
        assertEquals(new Bai10().findFn(1),0.6666666666666666,0.0001);
    }
}
