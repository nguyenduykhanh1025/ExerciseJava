import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai25Test {

    @Test
    public void test_layDaySoFibonaciKhongLonHon(){
        assertEquals(new Bai25().layDaySoFibonaciKhongLonHon(6),"1 1 2 3 5");
        assertEquals(new Bai25().layDaySoFibonaciKhongLonHon(-5),"");
    }

    @Test
    public void test_getCountFibonaciFromMToN(){
        assertEquals(new Bai25().getCountFibonaciFromMToN(2,5),3);
    }
}
