package oop3;

import com.google.gson.Gson;

import java.util.List;

public class StudentContainer {
    private List<Student> students;

    public StudentContainer(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static StudentContainer fromJson(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, StudentContainer.class);
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
