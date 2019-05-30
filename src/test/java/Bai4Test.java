import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai4Test {
    @Test
    public void test_phanTichThuaSoNguyenTo(){
        assertEquals(new Bai4().phanTichThuaSoNguyenTo(600),"2^3+3^1+5^2");
        assertEquals(new Bai4().phanTichThuaSoNguyenTo(0),"0");
        assertEquals(new Bai4().phanTichThuaSoNguyenTo(1),"1");
    }
}
