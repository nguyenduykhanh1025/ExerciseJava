import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiTest {
    @Test
    public void test_getPi()
    {
        assertEquals(new Pi().getPi(), "3.14159");
    }
}
