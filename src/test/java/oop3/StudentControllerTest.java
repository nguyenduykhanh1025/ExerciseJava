package oop3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StudentControllerTest {

    @Test
    public void test_addStudent(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).addStudent(student).size(),4);
    }

    @Test
    public void test_deleteStudent(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).deleteStudent(1).size(),2);
    }

    @Test
    public void test_deleteStudent2(){
        assertNull(new StudentController().deleteStudent(2));
    }

    @Test
    public void test_getById(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).getById(1).getId(),1);
    }

    @Test
    public void test_getById2(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertNull(new StudentController(students).getById(5));
    }

    @Test
    public void test_findByName(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByName("khanh").size(),3);
    }

    @Test
    public void test_findByName2(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByName("adu").size(),0);
    }

    @Test
    public void test_findByClassName(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByClassName("19").size(),3);
    }

    @Test
    public void test_findByClassName2(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByClassName("adu").size(),0);
    }

    @Test
    public void test_saveToFile(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).saveToFile(Common.path),true);
    }

    @Test
    public void test_saveToFile2(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).saveToFile(""),false);
    }

    @Test
    public void test_getStudents(){
        Student student = new Student.StudentBuilder().setId(1).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student1 = new Student.StudentBuilder().setId(2).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        Student student2 = new Student.StudentBuilder().setId(3).setClassName("19").setBirthday("20/12/1998").setAddress("A").setFirstName("khanh").setLastName("nguyen").build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).getStudents().size(),3);
    }

    @Test
    public void test_loadFromFile(){
        assertEquals(new StudentController().loadFromFile(Common.path),true);
    }

    @Test
    public void test_loadFromFile2(){
        assertEquals(new StudentController().loadFromFile(""),false);
    }
}
