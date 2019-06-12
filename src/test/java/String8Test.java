import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String8Test {
    @Test
    public void test_getStringStandard(){
        String str = "a.   a  ?      a            a !B, adu";
        String result = "A. A? A a! B, adu";
        assertEquals(new String8().getStringStandard(str),result);
    }

}
