import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai3Test {
    @Test
    public void test_phanTichThuaSoNguyenTo(){
        assertEquals(new Bai3().phanTichThuaSoNguyenTo(600), "2*2*2*3*5*5");
        assertEquals(new Bai3().phanTichThuaSoNguyenTo(1), "");
    }
}
