import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String17Test {

    @Test
    public void test_addZero(){
        String s = "12";
        assertEquals(new String17().addZero(s,2),"0012");
    }

    @Test
    public void test_getSubtraction(){
        String a = "45";
        String b = "55";
        String result = "-10";
        assertEquals(new String17().getSubtraction(a,b),result);
    }

    @Test
    public void test_getSubtraction2(){
        String a = "55";
        String b = "45";
        String result = "10";
        assertEquals(new String17().getSubtraction(a,b),result);
    }

    @Test
    public void test_getSubtraction3(){
        String a = "55";
        String b = "1229";
        String result = "-1174";
        assertEquals(new String17().getSubtraction(a,b),result);
    }

    @Test
    public void test_getSubtraction4(){
        String a = "1229";
        String b = "55";
        String result = "1174";
        assertEquals(new String17().getSubtraction(a,b),result);
    }

}
