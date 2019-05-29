import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai15Test {
    @Test
    public void test_findinfomationOfTriangle(){
        assertEquals(new Bai15().findInfomationOfTriangle(3,4,6),"13.0 90.49861877399013 thuong");
        assertEquals(new Bai15().findInfomationOfTriangle(3,1,1),"khong phai la tam giac");
        assertEquals(new Bai15().findInfomationOfTriangle(1,3,1),"khong phai la tam giac");
        assertEquals(new Bai15().findInfomationOfTriangle(1,1,3),"khong phai la tam giac");
        assertEquals(new Bai15().findInfomationOfTriangle(3,4,4),"11.0 65.66582063752801 can");
        assertEquals(new Bai15().findInfomationOfTriangle(4,4,3),"11.0 65.66582063752801 can");
        assertEquals(new Bai15().findInfomationOfTriangle(4,3,4),"11.0 65.66582063752801 can");
        assertEquals(new Bai15().findInfomationOfTriangle(3,4,5),"12.0 77.76888838089432 vuong");
        assertEquals(new Bai15().findInfomationOfTriangle(4,5,3),"12.0 77.76888838089432 vuong");
        assertEquals(new Bai15().findInfomationOfTriangle(5,4,3),"12.0 77.76888838089432 vuong");

    }
}
