import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai26Test {
    @Test
    public void test_getFibonaciCrazyAtN(){
        int[] arr = {6, 2, 2, 1, 4};
        assertEquals(new Bai26().getFibonaciCrazyAtN(6,arr),5);
    }
}
