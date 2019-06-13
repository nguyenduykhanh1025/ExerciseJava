import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String11Test {
    @Test
    public void test_isNumber(){
        assertEquals(new String11().isNumber('0'),true);
        assertEquals(new String11().isNumber('9'),true);
        assertEquals(new String11().isNumber('8'),true);
        assertEquals(new String11().isNumber('+'),false);
        assertEquals(new String11().isNumber('A'),false);
    }

    @Test
    public void test_getResultFx(){
        String s = "20+30";
        assertEquals(new String11().getResultFx(s),50,0.01);
    }

    @Test
    public void test_getResultFx1(){
        String s = "20-30";
        assertEquals(new String11().getResultFx(s),-10,0.01);
    }

    @Test
    public void test_getResultFx2(){
        String s = "20*30";
        assertEquals(new String11().getResultFx(s),600,0.01);
    }

    @Test
    public void test_getResultFx3(){
        String s = "20/30";
        assertEquals(new String11().getResultFx(s),0.6666666666666666,0.01);
    }

    @Test
    public void test_getResultFx4(){
        String s = "1<<2";
        assertEquals(new String11().getResultFx(s),4,0.01);
    }

    @Test
    public void test_getResultFx5(){
        String s = "1>>2";
        assertEquals(new String11().getResultFx(s),0,0.01);
    }
}
