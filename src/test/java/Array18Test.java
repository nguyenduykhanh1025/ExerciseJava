import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array18Test {
    @Test
    public void test_sortMatrix(){
        int [][] arr = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        int [][] arrResult = {{5,4,3,2,1},{10,9,8,7,6},{15,14,13,12,11},{20,19,18,17,16},{25,24,23,22,21}};
        int n = 5, m = 5;
        for(int i = 0; i< n; ++i){
            assertArrayEquals(new Array18().sortMatrix(arr,n,m)[i],arrResult[i]);
        }
    }
}
