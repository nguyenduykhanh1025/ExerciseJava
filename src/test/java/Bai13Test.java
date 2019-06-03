import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai13Test {
    @Test
    public void test_findE(){
        assertEquals(new Bai13().findE(), 2.71828,0.00001);
    }
}
