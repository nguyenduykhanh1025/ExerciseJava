import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String19Test {
    @Test
    public void test_getDivision() {
        String a = "10";
        String b = "5";
        assertEquals(new String19().getDivision(a, b), 2);
    }

    @Test
    public void test_getDivision1() {
        String a = "5";
        String b = "10";
        assertEquals(new String19().getDivision(a, b), 0);
    }

    @Test
    public void test_getDivision12() {
        String a = "10";
        String b = "50";
        assertEquals(new String19().getDivision(a, b), 0);
    }

    @Test
    public void test_getDivision13() {
        String a = "50";
        String b = "10";
        assertEquals(new String19().getDivision(a, b), 5);
    }

    @Test
    public void test_getDivision14() {
        String a = "12";
        String b = "5";
        assertEquals(new String19().getDivision(a, b), 2);
    }

    @Test
    public void test_addZero() {
        String s = "12";
        assertEquals(new String19().addZero(s, 2), "0012");
    }

    @Test
    public void test_getSubtraction() {
        String a = "45";
        String b = "55";
        String result = "-10";
        assertEquals(new String19().getSubtraction(a, b), result);
    }

    @Test
    public void test_getSubtraction2() {
        String a = "55";
        String b = "45";
        String result = "10";
        assertEquals(new String19().getSubtraction(a, b), result);
    }

    @Test
    public void test_getSubtraction3() {
        String a = "55";
        String b = "1229";
        String result = "-1174";
        assertEquals(new String19().getSubtraction(a, b), result);
    }

    @Test
    public void test_getSubtraction4() {
        String a = "1229";
        String b = "55";
        String result = "1174";
        assertEquals(new String19().getSubtraction(a, b), result);
    }

}
