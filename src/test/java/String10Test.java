import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String10Test {
    @Test
    public void test_getRevivalString(){
        String s = "abc4e6fd";
        assertEquals(new String10().getRevivalString(s),"abcccceeeeeefd");
    }

    @Test
    public void test_shortcutString(){
        String str = "abcccceeeefddd";
        String result = "abc4e4fd3";
        assertEquals(new String10().shortcutString(str),result);
    }
}
