import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String15Test {
    @Test
    public void test_getVerifyNumber(){
        String str = "893850597419";
        int result = 4;
        assertEquals(new String15().getVerifyNumber(str),result);
    }

    @Test
    public void test_getVerifyNumber1(){
        String str = "8938505974195";
        int result = -1;
        assertEquals(new String15().getVerifyNumber(str),result);
    }

    @Test
    public void test_getVerifyNumber2(){
        String str = "8938505974194";
        int result = 0;
        assertEquals(new String15().getVerifyNumber(str),result);
    }
}
