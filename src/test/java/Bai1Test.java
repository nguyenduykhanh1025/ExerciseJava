import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai1Test {
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
}
