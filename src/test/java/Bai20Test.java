import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai20Test {
    @Test
    public void test_layDaySoFibonaciKhongLonHon(){
        assertEquals(new Bai20().layDaySoFibonaciKhongLonHon(6),"1 1 2 3 5");
        assertEquals(new Bai20().layDaySoFibonaciKhongLonHon(-5),"");
    }

    @Test
    public void test_getSumOfFibonaci(){
        assertEquals(new Bai20().getSumOfFibonaci(5),12);
    }
}
