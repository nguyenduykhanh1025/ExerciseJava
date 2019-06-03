import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai6Test {
    @Test
    public void test_giaiPhuongTrinhBac2(){
        assertEquals(new Bai6().giaiPhuongTrinhBac2(2,-7,3), "3.0 0.5");
        assertEquals(new Bai6().giaiPhuongTrinhBac2(1,2,1), "-1.0");
        assertEquals(new Bai6().giaiPhuongTrinhBac2(1,2,2), "vo nghiem");
    }
}
