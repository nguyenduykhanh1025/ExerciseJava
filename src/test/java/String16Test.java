import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String16Test {
    @Test
    public void test_getSum(){
        String a = "12444";
        String b = "948";
        assertEquals(new String16().getSum(a,b),"13392");
    }

    @Test
    public void test_getSum1(){
        String a = "948";
        String b = "12444";
        assertEquals(new String16().getSum(a,b),"13392");
    }

    @Test
    public void test_getSum2(){
        String a = "123";
        String b = "456";
        assertEquals(new String16().getSum(a,b),"0579");
    }


    @Test
    public void test_getSum3(){
        String a = "923";
        String b = "456";
        assertEquals(new String16().getSum(a,b),"1379");
    }

    @Test
    public void test_getSum4(){
        String a = "423";
        String b = "1456";
        assertEquals(new String16().getSum(a,b),"1879");
    }
}
