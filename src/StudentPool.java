import java.util.ArrayList;

public class StudentPool {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student std) {
        studentList.add(std);
        System.out.println("Student added successfully.");
        System.out.println("Total students = " + studentList.size());
    }

    public int getTotalStudents() {
        return studentList.size();
    }

    public Student findStudentById(String id) {
        for (Student std : studentList) {
            if (std.getId().equalsIgnoreCase(id)) {
                return std;
            }
        }
        return null;
    }

}
