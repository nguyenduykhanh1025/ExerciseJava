package oop3;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentController {

    private List<Student> students;


    public List<Student> addStudent(Student student) {
        this.students.add(student);
        return this.students;
    }

    public List<Student> deleteStudent(int id) {
        if (students.size() != 0) {
            for (Student student : students) {
                if (student.getId() == id) {
                    this.students.remove(student);
                    return this.students;
                }
            }
        }
        return null;
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
            if (student.getFirstName().equals(name)) {
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

    public boolean saveToFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            Gson jsonArray = new Gson();

            String gsonData = jsonArray.toJson(students);

            try {
                dos.writeUTF(gsonData);

                dos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public boolean loadFromFile(String path) {
        try {

            Gson jsonArray = new Gson();
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);

            try {

                String data = dis.readUTF();
                Student[] studentArr = jsonArray.fromJson(data, Student[].class);
                this.students = new ArrayList<>(Arrays.asList(studentArr));

                dis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
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
