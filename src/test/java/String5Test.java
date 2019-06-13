import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String5Test {
    @Test
    public void test_getListStringAppearDouble() {
        String str = "This HTML tutorial contains hundreds! of, HTML.";
        ArrayList<String> result = new ArrayList<>(Arrays.asList("HTML"));
        int i = 0;
        for (String s : result) {
            assertEquals(new String5().getListStringAppearDouble(str).get(i++), s);
        }
    }

}
