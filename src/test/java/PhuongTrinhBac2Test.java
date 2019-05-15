import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PhuongTrinhBac2Test {
    @Test
    public void test_giaiPhuongTrinhBac2() {
        assertEquals(new PhuongTrinhBac2().giaiPhuongTrinhBac2(1,4,3),"-1.0 -3.0");
        assertEquals(new PhuongTrinhBac2().giaiPhuongTrinhBac2(1,4,8),"");
        assertEquals(new PhuongTrinhBac2().giaiPhuongTrinhBac2(1,4,3),"-1.0 -3.0");
        assertEquals(new PhuongTrinhBac2().giaiPhuongTrinhBac2(1,4,4),"-2.0");

    }
}
