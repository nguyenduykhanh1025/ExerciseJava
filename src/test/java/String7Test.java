import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String7Test {
    @Test
    public void test_getIndexSubString(){
        String str = "abcd";
        String sub = "d";
        assertEquals(new String7().getIndexSubString(str,sub),3);
    }

    @Test
    public void test_getIndexSubString2(){
        String str = "abcd";
        String sub = "bcdf";
        assertEquals(new String7().getIndexSubString(str,sub),-1);
    }

    @Test
    public void test_getIndexSubString3(){
        String str = "abcd";
        String sub = "abf";
        assertEquals(new String7().getIndexSubString(str,sub),-1);
    }
}
