import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai5Test {
    @Test
    public void test_layDaySoFibonaciKhongLonHon(){
        assertEquals(new Bai5().layDaySoFibonaciKhongLonHon(6),"1 1 2 3 5");
        assertEquals(new Bai5().layDaySoFibonaciKhongLonHon(-5),"");
    }
}
