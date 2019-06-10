import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array25Test {
    @Test
    public void test_getUCNNArray(){
        int []arr = {24,6,9};
        assertEquals(new Array25().getUCNNArray(arr),3);
        int []arr1 = {0,2,1};
        assertEquals(new Array25().getUCNNArray(arr1),1);

    }
    @Test
    public void test_findUCLN(){
        assertEquals(new Array25().findUCLN(42,56),14);
        assertEquals(new Array25().findUCLN(6,6),6);
        assertEquals(new Array25().findUCLN(56,42),14);
        assertEquals(new Array25().findUCLN(56,0),56);
    }
}
