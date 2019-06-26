package oop2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest implements ShapeTest {
    @Test
    public void test_showInfo() {
        assertEquals(new Circle(1, 2, 3).showInfo(), "Circle " + 1.0 + " " + 2.0 + " " + 3.0);
    }

    @Test
    public void test_getArea() {
        assertEquals(new Circle(1, 2, 3).getArea(), 28.274333882308138, 0.001);
    }

    @Test
    public void test_getPerimeter() {
        assertEquals(new Circle(1, 2, 3).getPerimeter(), 18.84955592153876, 0.001);
    }
}
