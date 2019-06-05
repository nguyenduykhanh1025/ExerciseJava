import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array10Test {
    @Test
    public void test_splitN(){
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        int [][]arrResult = {{1,2,3},{4,5,0}};
        for(int i = 0; i< (int) Math.round(arr.length * 1.0 / n); ++i){
            assertArrayEquals(new Array10().splitN(arr,n)[i],arrResult[i]);
        }
    }
}
