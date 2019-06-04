import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai29Test {
    @Test
    public void test_coverRomanNumberToDecimalNumber(){
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("VI"),6);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("LX"),60);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("MCMVIII"),1908);
        assertEquals(new Bai29().coverRomanNumberToDecimalNumber("CD"),400);
    }
}
