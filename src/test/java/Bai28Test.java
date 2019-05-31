import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai28Test {
    @Test
    public void test_getSqrt(){
        assertEquals(new Bai28().getSqrt(4),2.0,0.01);
        assertEquals(new Bai28().getSqrt(2),1.414,0.01);
        assertEquals(new Bai28().getSqrt(2.5),1.581,0.01);
        assertEquals(new Bai28().getSqrt(-2.5),0,0.01);
    }
}
