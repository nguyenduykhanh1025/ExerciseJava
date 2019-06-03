import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai29Test {
    @Test
    public void test_getSingleDecimalNumber(){
        assertEquals(new Bai29().getSingleDecimalNumber('I'),1);
        assertEquals(new Bai29().getSingleDecimalNumber('V'),5);
        assertEquals(new Bai29().getSingleDecimalNumber('X'),10);
        assertEquals(new Bai29().getSingleDecimalNumber('L'),50);
        assertEquals(new Bai29().getSingleDecimalNumber('C'),100);
        assertEquals(new Bai29().getSingleDecimalNumber('D'),500);
        assertEquals(new Bai29().getSingleDecimalNumber('M'),1000);
        assertEquals(new Bai29().getSingleDecimalNumber(' '),0);
    }

    @Test
    public void test_coverRomanNumberToDecimalNumber(){
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("VI"),6);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("LX"),60);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("MCMVIII"),1908);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("CD"),400);
    }
}
