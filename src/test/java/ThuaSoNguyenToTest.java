import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThuaSoNguyenToTest {
    @Test
    public void test_phanTichThuaSoNguyenTo() {
        assertEquals(new ThuaSoNguyenTo().phanTichThuaSoNguyenTo(600), "2*2*2*3*5*5");
        assertEquals(new ThuaSoNguyenTo().phanTichThuaSoNguyenTo(0), "");

    }

    @Test
    public void test_getSampleOfNumberInArr() {
        int[] arr = {1,2,3};
        assertEquals(new ThuaSoNguyenTo().getSampleOfNumberInArr(arr, 3, 1), 1);
    }
}
