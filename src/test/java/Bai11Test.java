import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai11Test {
    @Test
    public void test_tinhLaiLuyTien(){
        assertEquals(new Bai11().tinhLaiLuyTien(2), 225.0, 0.001);
        assertEquals(new Bai11().tinhLaiLuyTien(4), 244.141, 0.001);
    }
}
