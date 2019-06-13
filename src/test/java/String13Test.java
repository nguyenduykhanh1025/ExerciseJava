import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String13Test {
    @Test
    public void test_isSameString(){
        String a = "abcd";
        String b = "dbca";
        assertEquals(new String13().isSameString(a,b),true);
    }

    @Test
    public void test_isSameString1(){
        String a = "abcd";
        String b = "dbcd";
        assertEquals(new String13().isSameString(a,b),false);
    }

    @Test
    public void test_isSameString2(){
        String a = "abcd";
        String b = "dbcdsd";
        assertEquals(new String13().isSameString(a,b),false);
    }
}
