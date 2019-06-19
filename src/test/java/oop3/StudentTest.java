package oop3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void test_getId(){
        assertEquals(new Student.StudentBuilder().setId(1).build().getId(),1);
    }

    @Test
    public void test_getFirstName(){
        assertEquals(new Student.StudentBuilder().setFirstName("khanh").build().getFirstName(),"khanh");
    }

    @Test
    public void test_getLastName(){
        assertEquals(new Student.StudentBuilder().setLastName("khanh").build().getLastName(),"khanh");
    }

    @Test
    public void test_getBirthday(){
        assertEquals(new Student.StudentBuilder().setBirthday("20/12/1998").build().getBirthday(),"20/12/1998");
    }

    @Test
    public void test_getClassName(){
        assertEquals(new Student.StudentBuilder().setClassName("16T1").build().getClassName(),"16T1");
    }

    @Test
    public void test_getAddress(){
        assertEquals(new Student.StudentBuilder().setAddress("A").build().getAddress(),"A");
    }
}
