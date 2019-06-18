import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String15Test {
    @Test
    public void test_getVerifyNumber(){
        assertEquals(new String15().getVerifyNumber("893850597419"),4);
    }

    @Test
    public void test_getVerifyNumber1(){
        assertEquals(new String15().getVerifyNumber("893502532933"),6);
    }

    @Test
    public void test_getVerifyNumber2(){
        assertEquals(new String15().getVerifyNumber("893850597419"),4);
    }
}
