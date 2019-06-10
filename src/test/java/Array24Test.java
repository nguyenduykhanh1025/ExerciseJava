import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array24Test {

    @Test
    public void test_findUCLN(){
        assertEquals(new Bai1().findUCLN(42,56),14);
        assertEquals(new Bai1().findUCLN(6,6),6);
        assertEquals(new Bai1().findUCLN(56,42),14);
        assertEquals(new Bai1().findUCLN(56,0),56);
    }
    @Test
    public void test_findBCNN(){
        assertEquals(new Bai1().findBCNN(4,6),12);
    }

    @Test
    public void test_getBCNNArray(){
        int []arr = {12,24,18};
        assertEquals(new Array24().getBCNNArray(arr),72);

        int []arr1 = {0,24,18};
        assertEquals(new Array24().getBCNNArray(arr1),0);
    }
}
