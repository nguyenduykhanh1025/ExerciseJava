import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array1Test {
    @Test
    public void test_findNumberAppearTwice(){
        float[] arrData = {1,2,13,1,2};
        int n = 5;
        assertEquals(new Array1().findNumberAppearTwice(arrData,n),"1.0 2.0");
    }
}
