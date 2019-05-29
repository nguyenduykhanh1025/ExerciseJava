import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai24Test {
    @Test
    public void test_layDaySoFibonaciKhongLonHon(){
        assertEquals(new Bai24().layDaySoFibonaciKhongLonHon(6),"1 1 2 3 5");
        assertEquals(new Bai24().layDaySoFibonaciKhongLonHon(-5),"");
    }

    @Test
    public void test_getCountOfFibonaci(){
        assertEquals(new Bai24().getCountOfFibonaci(5),5);
    }
}
