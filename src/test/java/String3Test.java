import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String3Test {
    @Test
    public void test_isStringSymmetric(){
        String s = "aba";
        assertEquals(new String3().isStringSymmetric(s),true);
    }

    @Test
    public void test_isStringSymmetric2(){
        String s = "abac";
        assertEquals(new String3().isStringSymmetric(s),false);
    }
}
