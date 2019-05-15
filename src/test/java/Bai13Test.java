import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Bai13Test {
    @Test
    public void test_Bai13() {
        assertEquals(new Bai13().getResurt(), "2.718282");
    }
    @Test
    public void test_layGiaThua() {
        assertEquals(new Bai13().layGiaThua(3), 6);
        assertEquals(new Bai13().layGiaThua(1), 1);
    }
}
