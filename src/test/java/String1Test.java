import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String1Test {
    @Test
    public void test_getSentenceInString(){
        String str = "a\nb?c.d!e";
        String []arrResult = {"a","b","c","d","e"};
        assertArrayEquals(new String1().getSentenceInString(str),arrResult);
    }

}
