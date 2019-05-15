import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UCLN_BCNNTEST {

    @Test
    public void test_find_UCLN(){
        assertEquals(new UCLN_BCNN().find_UCLN(-30,18), 6);
        assertEquals(new UCLN_BCNN().find_UCLN(30,-18), 6);
        assertEquals(new UCLN_BCNN().find_UCLN(18,30), 6);
        assertEquals(new UCLN_BCNN().find_UCLN(30,18), 6);
        assertEquals(new UCLN_BCNN().find_UCLN(6,6), 6);
        assertEquals(new UCLN_BCNN().find_UCLN(5,6), 1);
    }

    @Test
    public void test_find_BCNN(){
//        assertEquals(new UCLN_BCNN().find_BCNN(6,9), 18);
//        assertEquals(new UCLN_BCNN().find_BCNN(9,6), 18);
//        assertEquals(new UCLN_BCNN().find_BCNN(6,6), 6);
//        assertEquals(new UCLN_BCNN().find_BCNN(6,12), 12);
        assertEquals(new UCLN_BCNN().find_BCNN(6,9), 1);
    }
}
