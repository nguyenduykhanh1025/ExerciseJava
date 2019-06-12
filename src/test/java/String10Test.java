import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String10Test {
    @Test
    public void test_getRevivalString(){
        String s = "abc2e6fd91";
        assertEquals(new String10().getRevivalString(s),"abcceeeeeefddddddddd1");
    }

    @Test
    public void test_shortcutString(){
        String str = "abcccceeeefddd";
        String result = "abc4e4fd3";
        assertEquals(new String10().shortcutString(str),result);
    }

}
