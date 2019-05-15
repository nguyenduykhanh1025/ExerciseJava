import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThuaSoNguyenToBai4Tess {

    @Test
    public void test_phanTichThuaSoNguyenTo() {
        assertEquals(new ThuaSoNguyenToBai4().phanTichThuaSoNguyenTo(76), "2^2*19^1");
    }

    @Test
    public void test_getSampleOfNumberInArr() {
        int arr[] = {1,2,3};
        assertEquals(new ThuaSoNguyenToBai4().getSampleOfNumberInArr(arr, 3, 1), 1);
    }
}
