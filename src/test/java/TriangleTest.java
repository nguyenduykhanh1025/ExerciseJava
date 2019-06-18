import oop1.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void test_getType(){
        assertEquals(new Triangle(4, 12, -11, 2, 13, -4).getType(),"thuong");
    }
    @Test
    public void test_getType2(){
        assertEquals(new Triangle(4, 11, -11, 2, 13, -4).getType(),"vuong");
        assertEquals(new Triangle(4, 11, 13, -4, -11, 2).getType(),"vuong");
        assertEquals(new Triangle(13, -4, -11, 2, 4, 11).getType(),"vuong");
        assertEquals(new Triangle(13, -4, 4, 11, -11, 2).getType(),"vuong");
        assertEquals(new Triangle(-11, 2, 4, 11, 13, -4).getType(),"vuong");
        assertEquals(new Triangle(-11, 2, 13, -4, 4, 11).getType(),"vuong");
    }

    @Test
    public void test_getType3(){
        assertEquals(new Triangle(-1, 1, 1, 3, 2, 0).getType(),"can");
        assertEquals(new Triangle(-1, 1, 2, 0, 1, 3).getType(),"can");
        assertEquals(new Triangle(1, 3, -1, 1, 2, 0).getType(),"can");
        assertEquals(new Triangle(1, 3, 2, 0, -1, 1).getType(),"can");
        assertEquals(new Triangle(2, 0, -1, 1, 1, 3).getType(),"can");
        assertEquals(new Triangle(2, 0, 1, 3, -1, 1).getType(),"can");
    }

    @Test
    public void test_getType4(){
        assertEquals(new Triangle(2, 3, -1, -3, 0, -1).getType(),"khong phai la tam giac");
        assertEquals(new Triangle(2, 3, 0, -1, -1, -3).getType(),"khong phai la tam giac");
        assertEquals(new Triangle(-1, -3, 2, 3, 0, -1).getType(),"khong phai la tam giac");
        assertEquals(new Triangle(-1, -3, 0, -1, 2, 3).getType(),"khong phai la tam giac");
        assertEquals(new Triangle(0, -1, 2, 3, -1, -3).getType(),"khong phai la tam giac");
        assertEquals(new Triangle(0, -1, -1, -3, 2, 3).getType(),"khong phai la tam giac");
    }

    @Test
    public void test_getPerimeter(){
        assertEquals(new Triangle(4, 12, -11, 2, 13, -4).getPerimeter(),61.12394988171173,0.01);
    }

    @Test
    public void test_getPerimeter1(){
        assertEquals(new Triangle(4, 11, -11, 2, 13, -4).getPerimeter(),59.72434512277776,0.001);
        assertEquals(new Triangle(4, 11, 13, -4, -11, 2).getPerimeter(),59.72434512277776,0.001);
        assertEquals(new Triangle(13, -4, -11, 2, 4, 11).getPerimeter(),59.72434512277776,0.001);
        assertEquals(new Triangle(13, -4, 4, 11, -11, 2).getPerimeter(),59.72434512277776,0.001);
        assertEquals(new Triangle(-11, 2, 4, 11, 13, -4).getPerimeter(),59.72434512277776,0.001);
        assertEquals(new Triangle(-11, 2, 13, -4, 4, 11).getPerimeter(),59.72434512277776,0.001);
    }

    @Test
    public void test_getPerimeter2(){
        assertEquals(new Triangle(-1, 1, 1, 3, 2, 0).getPerimeter(),9.15298244508295,0.01);
        assertEquals(new Triangle(-1, 1, 2, 0, 1, 3).getPerimeter(),9.15298244508295,0.01);
        assertEquals(new Triangle(1, 3, -1, 1, 2, 0).getPerimeter(),9.15298244508295,0.01);
        assertEquals(new Triangle(1, 3, 2, 0, -1, 1).getPerimeter(),9.15298244508295,0.01);
        assertEquals(new Triangle(2, 0, -1, 1, 1, 3).getPerimeter(),9.15298244508295,0.01);
        assertEquals(new Triangle(2, 0, 1, 3, -1, 1).getPerimeter(),9.15298244508295,0.01);
    }

    @Test
    public void test_getPerimeter3(){
        assertEquals(new Triangle(2, 3, -1, -3, 0, -1).getPerimeter(),-1,0.01);
        assertEquals(new Triangle(2, 3, 0, -1, -1, -3).getPerimeter(),-1,0.01);
        assertEquals(new Triangle(-1, -3, 2, 3, 0, -1).getPerimeter(),-1,0.01);
        assertEquals(new Triangle(-1, -3, 0, -1, 2, 3).getPerimeter(),-1,0.01);
        assertEquals(new Triangle(0, -1, 2, 3, -1, -3).getPerimeter(),-1,0.01);
        assertEquals(new Triangle(0, -1, -1, -3, 2, 3).getPerimeter(),-1,0.01);
    }


    @Test
    public void test_getArea(){
        assertEquals(new Triangle(4, 12, -11, 2, 13, -4).getArea(),2024.6014089958976,0.01);
    }

    @Test
    public void test_getArea2(){
        assertEquals(new Triangle(4, 11, -11, 2, 13, -4).getArea(),1930.4450822981573,0.001);
        assertEquals(new Triangle(4, 11, 13, -4, -11, 2).getArea(),1930.4450822981573,0.001);
        assertEquals(new Triangle(13, -4, -11, 2, 4, 11).getArea(),1930.4450822981573,0.001);
        assertEquals(new Triangle(13, -4, 4, 11, -11, 2).getArea(),1930.4450822981573,0.001);
        assertEquals(new Triangle(-11, 2, 4, 11, 13, -4).getArea(),1930.4450822981573,0.001);
        assertEquals(new Triangle(-11, 2, 13, -4, 4, 11).getArea(),1930.4450822981573,0.001);
    }

    @Test
    public void test_getArea3(){
        assertEquals(new Triangle(-1, 1, 1, 3, 2, 0).getArea(),45.57999058314847,0.01);
        assertEquals(new Triangle(-1, 1, 2, 0, 1, 3).getArea(),45.57999058314847,0.01);
        assertEquals(new Triangle(1, 3, -1, 1, 2, 0).getArea(),45.57999058314847,0.01);
        assertEquals(new Triangle(1, 3, 2, 0, -1, 1).getArea(),45.57999058314847,0.01);
        assertEquals(new Triangle(2, 0, -1, 1, 1, 3).getArea(),45.57999058314847,0.01);
        assertEquals(new Triangle(2, 0, 1, 3, -1, 1).getArea(),45.57999058314847,0.01);
    }

    @Test
    public void test_getArea4(){
        assertEquals(new Triangle(2, 3, -1, -3, 0, -1).getArea(),-1,0.01);
        assertEquals(new Triangle(2, 3, 0, -1, -1, -3).getArea(),-1,0.01);
        assertEquals(new Triangle(-1, -3, 2, 3, 0, -1).getArea(),-1,0.01);
        assertEquals(new Triangle(-1, -3, 0, -1, 2, 3).getArea(),-1,0.01);
        assertEquals(new Triangle(0, -1, 2, 3, -1, -3).getArea(),-1,0.01);
        assertEquals(new Triangle(0, -1, -1, -3, 2, 3).getArea(),-1,0.01);
    }
}
