import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiaiThuaBai8Test {

    @Test
    public void test_layGiaiThuaCuaSo() {
        assertEquals(new GiaiThuaBai8().layGiaiThuaCuaSo(5),120);
        assertEquals(new GiaiThuaBai8().layGiaiThuaCuaSo(0),1);
        assertEquals(new GiaiThuaBai8().layGiaiThuaCuaSo(-2),1);

    }
}
