package oop3;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentControllerTest {


    private StudentController studentController;

    @Before
    public void init() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        studentController = new StudentController(students);
    }

    @Test
    public void test_addStudent() {
        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();
        studentController.addStudent(student2);
        assertEquals(studentController.getStudents().size(), 4);
    }

    @Test
    public void test_deleteStudent() {
        studentController.deleteStudent(2);
        assertEquals(studentController.getStudents().size(), 2);
    }

    @Test
    public void test_getStudents() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh"
                ).setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).getStudents().size(), 3);
    }

    @Test
    public void test_getById() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).getById(1).getId(), 1);
    }

    @Test
    public void test_getById2() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertNull(new StudentController(students).getById(5));
    }

    @Test
    public void test_findByName() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByName("khanh nguyen").size(), 3);
    }

    @Test
    public void test_findByName2() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByName("adu").size(), 0);
    }

    @Test
    public void test_findByClassName() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByClassName("19").size(), 3);
    }

    @Test
    public void test_findByClassName2() {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3).setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        assertEquals(new StudentController(students).findByClassName("adu").size(), 0);
    }

    @Test
    public void test_saveToFile() throws IOException {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        new StudentController(students).saveToFile(Common.path);
    }

    @Test(expected = IOException.class)
    public void test_saveToFile2() throws IOException {
        Student student = new Student
                .StudentBuilder()
                .setId(1)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student1 = new Student
                .StudentBuilder()
                .setId(2)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3)
                .setClassName("19")
                .setBirthday("20/12/1998")
                .setAddress("A")
                .setFirstName("khanh")
                .setLastName("nguyen")
                .build();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        new StudentController(students).saveToFile("");
    }
    @Test
    public void test_loadFromFile() throws IOException {
        new StudentController().loadFromFile(Common.path);
    }

    @Test(expected = IOException.class)
    public void test_loadFromFile2() throws IOException {
        new StudentController().loadFromFile("");
    }
}
