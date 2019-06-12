import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String8Test {
    @Test
    public void test_getStringStandard(){
        String str = "a.   A  ?      a            a";
        String result = "A. A? a a";
        assertEquals(new String8().getStringStandard(str),result);
    }

}
