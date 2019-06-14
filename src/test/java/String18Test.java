import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String18Test {
    @Test
    public void test_getMultiplication(){
        String a = "55";
        String b = "535";
        int result = 29425;
        assertEquals(new String18().getMultiplication(a,b),result);
    }

    @Test
    public void test_getMultiplication1(){
        String a = "535";
        String b = "55";
        int result = 29425;
        assertEquals(new String18().getMultiplication(a,b),result);
    }

    @Test
    public void test_getSum(){
        String a = "12444";
        String b = "948";
        assertEquals(new String18().getSum(a,b),13392);
    }

    @Test
    public void test_getSum1(){
        String a = "948";
        String b = "12444";
        assertEquals(new String18().getSum(a,b),13392);
    }

    @Test
    public void test_getSum2(){
        String a = "123";
        String b = "456";
        assertEquals(new String18().getSum(a,b),579);
    }


    @Test
    public void test_getSum3(){
        String a = "923";
        String b = "456";
        assertEquals(new String18().getSum(a,b),1379);
    }

    @Test
    public void test_getSum4(){
        String a = "423";
        String b = "1456";
        assertEquals(new String18().getSum(a,b),1879);
    }

    @Test
    public void test_addZero(){
        String s = "12";
        assertEquals(new String18().addZero(s,2),"1200");
    }
}
