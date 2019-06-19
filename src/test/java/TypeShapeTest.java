import oop1.typeShape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TypeShapeTest {
    @Test
    public void test_typeShape(){
        assertEquals(typeShape.INVALID.toString(),"khong phai la tam giac");
        assertEquals(typeShape.NORMAL.toString(),"thuong");
        assertEquals(typeShape.RIGHT_TRIANGLE.toString(),"vuong");
        assertEquals(typeShape.ISOSCELES_TRIANGLE.toString(),"can");
    }
}
