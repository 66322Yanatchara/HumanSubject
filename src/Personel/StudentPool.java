package Personel;

import java.util.ArrayList;

public class StudentPool {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
