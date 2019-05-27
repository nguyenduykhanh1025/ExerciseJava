import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai7Test {
    @Test
    public void test_findSumFollowNumber(){
        assertEquals(new Bai7().findSumFollowNumber(2),8);
        assertEquals(new Bai7().findSumFollowNumber(-2),0);
    }
}
