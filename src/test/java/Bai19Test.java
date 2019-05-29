import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai19Test {

    @Test
    public void test_getFactorial(){
        assertEquals(new Bai19().getFactorial(1),1);
        assertEquals(new Bai19().getFactorial(3),6);
    }

    @Test
    public void test_getnCk(){
        assertEquals(new Bai19().getnCk(3,1),3.0, 0.01);
        assertEquals(new Bai19().getnCk(3,5),-1, 0.01);
    }

    @Test
    public void test_getTrianglePascalAtN(){
        assertEquals(new Bai19().getTrianglePascalAtN(3),"1 2 1");
        assertEquals(new Bai19().getTrianglePascalAtN(0),"err");
        assertEquals(new Bai19().getTrianglePascalAtN(1),"1");
    }
}
