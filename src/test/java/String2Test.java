import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class String2Test {
    @Test
    public void test_getCharOrNumberInString(){
        String str = "abcA01}*79z";
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","0","1","7","9","z"));
        assertEquals(new String2().getCharOrNumberInString(str),list);
    }
}
