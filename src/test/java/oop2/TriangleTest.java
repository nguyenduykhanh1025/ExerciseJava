package oop2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest implements ShapeTest {

    @Test
    public void test_getEdgeA() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).getEdgeA(), 2.0, 0.01);
    }

    @Test
    public void test_getEdgeB() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).getEdgeB(), 2.23606797749979, 0.01);
    }

    @Test
    public void test_getEdgeC() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).getEdgeC(), 2.23606797749979, 0.01);
    }


    @Override
    @Test
    public void test_showInfo() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).showInfo(), "Triangle");
    }

    @Override
    @Test
    public void test_getArea() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).getArea(), 22.789995291574233, 0.01);
    }

    @Override
    @Test
    public void test_getPerimeter() {
        assertEquals(new Triangle(2, 3, 2, 1, 4, 2).getPerimeter(), 6.47213595499958, 0.01);
    }
}
