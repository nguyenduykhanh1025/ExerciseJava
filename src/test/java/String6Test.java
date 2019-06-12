import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String6Test {
    @Test
    public void test_getCovert(){
        String str = "ABCdef";
        String strResult = "abcDEF";
        assertEquals(new String6().getCovert(str),strResult);
    }
}
