import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String10Test {
    @Test
    public void test_getRevivalString(){
        String s = "abc2e6fd9";
        assertEquals(new String10().getRevivalString(s),"abcceeeeeefddddddddd");
    }

    @Test
    public void test_shortcutString(){
        String str = "abcccceeeefddd";
        String result = "abc4e4fd3";
        assertEquals(new String10().shortcutString(str),result);
    }

    @Test
    public void test_isNaN(){
        char i = '5';
        assertEquals(new String10().isNaN(i),true);

        char i2 = '2';
        assertEquals(new String10().isNaN(i2),true);

        char i3 = '9';
        assertEquals(new String10().isNaN(i3),true);

        char i1 = 's';
        assertEquals(new String10().isNaN(i1),false);
    }
}
