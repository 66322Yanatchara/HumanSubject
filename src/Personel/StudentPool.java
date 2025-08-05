import java.util.ArrayList;

public class StudentPool {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public int getTotalStudents() {
        return students.size();
    }

    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void displayStudentInfo() {
        System.out.println("\nAll Students Information:");
        for (Student s : students) {
            System.out.println("ID: " + s.getId() +
                    ", Name: " + s.getName() +
                    ", Score: " + s.getScore());
        }
    }
}
