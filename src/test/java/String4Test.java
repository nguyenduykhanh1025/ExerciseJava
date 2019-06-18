import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String4Test {
    @Test
    public void test_getSumIntoString(){
        String sData = "abc 123 def 33 mn 3.221";
        assertEquals(new String4().getSumIntoString(sData),380);
    }
}
