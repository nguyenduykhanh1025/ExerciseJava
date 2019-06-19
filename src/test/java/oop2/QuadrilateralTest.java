package oop2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrilateralTest implements ShapeTest {

    @Test
    public void test_getAB() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getAB(), 3.0, 0.01);
    }

    @Test
    public void test_getBC() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getBC(), 4.47213595499958, 0.01);
    }

    @Test
    public void test_getCD() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getCD(), 3.605551275463989, 0.01);
    }

    @Test
    public void test_getAD() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getAD(), 7.0710678118654755, 0.01);
    }

    @Override
    @Test
    public void test_showInfo() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).showInfo(), "Quadrilateral");
    }

    @Override
    @Test
    public void test_getArea() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getArea(), 187.67673220554184, 0.01);
        assertEquals(new Quadrilateral(9, 5, 2, 4, 5, 4, 7, 8).getArea(), 187.67673220554184, 0.01);
    }

    @Override
    @Test
    public void test_getPerimeter() {
        assertEquals(new Quadrilateral(2, 4, 5, 4, 7, 8, 9, 5).getPerimeter(), 18.148755042329043, 0.01);
    }
}
