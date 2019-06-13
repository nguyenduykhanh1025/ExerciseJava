import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String12Test {
    @Test
    public void test_deleteDuplicateInString(){
        String s = "aaabbbbccccc";
        String result = "abc";
        assertEquals(new String12().deleteDuplicateInString(s),result);
    }

}
