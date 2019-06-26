package oop2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {
    @Test
    public void test_getListData() {
        String data = "1 2 3\n2 4 5 1 4 5\n2 4 5 4 7 8 9 5";
        ArrayList<Shape> listShape = new ShapeFactory().getListData(data);
        assertEquals(listShape.size(), 3);
    }
}
