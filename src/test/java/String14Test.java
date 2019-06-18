import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class String14Test {
    @Test
    public void test_isBarcode(){
        String a = "8938505974194";
        assertEquals(new String14().isBarcode(a),true);
    }

    @Test
    public void test_isBarcode1(){
        String a = "893850597419";
        assertEquals(new String14().isBarcode(a),false);
    }
}
