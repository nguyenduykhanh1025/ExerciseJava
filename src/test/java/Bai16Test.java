import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai16Test {
    @Test
    public void test_findInfomationOfTriangle(){
        assertEquals(new Bai16().findInfomationOfTriangle(4,11,-11,2,13,-4),"59.72434512277776 1930.4450822981573 vuong");
        assertEquals(new Bai16().findInfomationOfTriangle(4,12,-11,2,13,-4),"61.12394988171173 2024.6014089958976 thuong");
        assertEquals(new Bai16().findInfomationOfTriangle(-1,1,1,3,2,0),"9.15298244508295 45.57999058314847 can");
        assertEquals(new Bai16().findInfomationOfTriangle(2,3,-1,-3,0,-1),"khong phai la tam giac");
    }
    @Test
    public void test_getLengthDistance(){
        assertEquals(new Bai16().getLengthDistance(4,11,-11,2), 17.4928556845359, 0.0001);
    }
}
