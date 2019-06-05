import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array13Test {
    @Test
    public void test_rotateArray90Degrees(){
        int [][]arr = {{1,2},{3,4}};
        int n = 2,m = 2;
        int [][]result = {{3,1},{4,2}};
        for(int i = 0; i< n; ++i){
            assertArrayEquals(new Array13().rotateArray90Degrees(arr,n,m)[i],result[i]);
        }
    }
}
