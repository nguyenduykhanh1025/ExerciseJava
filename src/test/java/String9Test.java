import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String9Test {
    @Test
    public void test_shortcutString(){
        String str = "abcccceeeefddd";
        String result = "abc4e4fd3";
        assertEquals(new String9().shortcutString(str),result);
    }
}
