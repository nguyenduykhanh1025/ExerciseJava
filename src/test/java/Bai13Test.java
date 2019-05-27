import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai13Test {
    @Test
    public void test_findFactorial(){
        assertEquals(new Bai13().findFactorial(0),1);
        assertEquals(new Bai13().findFactorial(3),6);
    }
    @Test
    public void test_findE(){
        assertEquals(new Bai13().findE(), 1.71828,0.00001);
    }
}
