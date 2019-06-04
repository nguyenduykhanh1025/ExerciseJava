import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bai30Test {
    @Test
    public void test_coverDecimalNumberToRomanNumber(){
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(1908),"MCMVIII");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(900),"CM");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(500),"D");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(400),"CD");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(100),"C");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(90),"XC");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(50),"L");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(40),"XL");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(10),"X");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(9),"IX");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(5),"V");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(4),"IV");
        assertEquals(new Bai30().coverDecimalNumberToRomanNumber(1),"I");
    }
}
