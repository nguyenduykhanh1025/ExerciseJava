import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array21Test {
    @Test
    public void test_getDeterminantMatrix(){
        int [][]arr = {{-1,2,3},{2,-1,4},{0,-3,2}};
        assertEquals(new Array21().getDeterminantMatrix(arr),-36.0,0.001);
    }

}
