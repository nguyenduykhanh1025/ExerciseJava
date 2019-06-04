import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array9Test {
    @Test
    public void test_binarySearch(){
        int arr[] = {2, 3, 4, 10, 40};
        int n = 5;

        assertEquals(new Array9().binarySearch(arr,0,n,10),3);
        assertEquals(new Array9().binarySearch(arr,0,n,11),-1);
        assertEquals(new Array9().binarySearch(arr,0,n,2),0);
    }
}
