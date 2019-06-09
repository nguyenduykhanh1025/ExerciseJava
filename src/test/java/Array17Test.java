import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array17Test {
    @Test
    public void test_getMatrixSprial(){
        int n = 5;
        int [][] arrResult = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};

        for(int i = 0; i< n; ++i){
            assertArrayEquals(new Array17().getMatrixSprial(n)[i],arrResult[i]);
        }
    }
}
