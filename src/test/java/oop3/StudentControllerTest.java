package oop3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentControllerTest {

    private static String path = "temp-data.json";

    @Before
    public void init(){
        File file = new File(path);

        if(file.exists()){
            file.delete();
        }
    }

    @After
    public void finalization(){
        File file = new File(path);

        if(file.exists()){
            file.delete();
        }
    }

    private StudentController createControllerWithData() {
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

        return new StudentController(students);
    }

    @Test
    public void test_addStudent() {
        StudentController studentController = createControllerWithData();

        Student student2 = new Student
                .StudentBuilder()
                .setId(3)
                .build();
        studentController.addStudent(student2);
        assertEquals(studentController.getStudents().size(), 4);
    }

    @Test
    public void test_deleteStudent() {
        StudentController studentController = createControllerWithData();
        studentController.deleteStudent(2);

        assertEquals(studentController.getStudents().size(), 2);
    }

    @Test
    public void test_deleteStudent2() {
        StudentController studentController = createControllerWithData();
        studentController.deleteStudent(4);

        assertEquals(studentController.getStudents().size(), 3);
    }

    @Test
    public void test_getStudents() {
        assertEquals(createControllerWithData().getStudents().size(), 3);
    }

    @Test
    public void test_getById() {
        assertEquals(createControllerWithData().getById(1).getId(), 1);
    }

    @Test
    public void test_getById2() {
        assertNull(createControllerWithData().getById(5));
    }

    @Test
    public void test_findByName() {
        assertEquals(createControllerWithData().findByName("khanh nguyen").size(), 3);
    }

    @Test
    public void test_findByName2() {
        assertEquals(createControllerWithData().findByName("adu").size(), 0);
    }

    @Test
    public void test_findByClassName() {
        assertEquals(createControllerWithData().findByClassName("19").size(), 3);
    }

    @Test
    public void test_findByClassName2() {
        assertEquals(createControllerWithData().findByClassName("adu").size(), 0);
    }

    @Test
    public void test_saveToFile() throws IOException {

        File file = new File(path);

        if(file.exists()){
            file.delete();
        }

        createControllerWithData().saveToFile(path);

        file = new File(path);

        assertTrue(file.exists());
    }

    @Test(expected = IOException.class)
    public void test_saveToFile2() throws IOException {
        createControllerWithData().saveToFile("");
    }

    @Test
    public void test_loadFromFile() throws IOException {

        createControllerWithData().saveToFile(path);

        StudentController studentController = new StudentController();

        studentController.loadFromFile(path);

        assertEquals(studentController.getStudents().size(), 3);
    }

    @Test(expected = IOException.class)
    public void test_loadFromFile2() throws IOException {
        new StudentController().loadFromFile("");
    }
}
