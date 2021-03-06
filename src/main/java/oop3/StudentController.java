package oop3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<Student> students;

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                this.students.remove(student);
                break;
            }
        }
    }

    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> findByName(String name) {
        List<Student> resultListStudent = new ArrayList<>();
        for (Student student : students) {
            if ((student.getFirstName() + " " + student.getLastName()).equals(name)) {
                resultListStudent.add(student);
            }
        }
        return resultListStudent;
    }

    public List<Student> findByClassName(String className) {
        List<Student> resultListStudent = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassName().equals(className)) {
                resultListStudent.add(student);
            }
        }
        return resultListStudent;
    }

    public void saveToFile(String path) throws IOException {

        FileOutputStream fos = new FileOutputStream(path);
        DataOutputStream dos = new DataOutputStream(fos);

        StudentContainer studentContainer = new StudentContainer(students);

        dos.writeUTF(studentContainer.toJson());

        dos.close();
        fos.close();
    }

    public void loadFromFile(String path) throws IOException {

        FileInputStream fis = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(fis);

        String json = dis.readUTF();

        this.students = StudentContainer.fromJson(json).getStudents();

        dis.close();
        fis.close();
    }

    public StudentController(List<Student> students) {
        this.students = students;
    }

    public StudentController() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }
}
