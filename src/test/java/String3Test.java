import org.junit.Test;

import static org.junit.Assert.*;

public class String3Test {
    @Test
    public void test_isStringSymmetric(){
        String s = "aba";
        assertTrue(new String3().isStringSymmetric(s));
    }

    @Test
    public void test_isStringSymmetric2(){
        String s = "abac";
        assertFalse(new String3().isStringSymmetric(s));
    }

    @Test
    public void test_isStringSymmetric3(){
        String s = "abfac";
        assertFalse(new String3().isStringSymmetric(s));
    }

    @Test
    public void test_isStringSymmetric4(){
        String s = "abba";
        assertTrue(new String3().isStringSymmetric(s));
    }
}
