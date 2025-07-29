import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentPool sPool = new StudentPool();

        char choice;
        do {
            Student stds = new Student();

            System.out.print("Enter your ID : ");
            stds.setId(scan.next());

            System.out.print("Enter your Name : ");
            stds.setName(scan.next());

            System.out.print("Enter your Score : ");
            stds.setScore(scan.nextInt());

            sPool.addStudent(stds);

            System.out.print("Do you want to add another student? (Y/N): ");
            choice = scan.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nFinished input. Total students = " + sPool.getTotalStudents());

        // 🔍 เพิ่มส่วนค้นหาด้วย ID
        System.out.print("\nEnter ID to search: ");
        String searchId = scan.next();

        Student found = sPool.findStudentById(searchId);
        if (found != null) {
            System.out.println("Student found: " + found.getName());
        } else {
            System.out.println("No student found with ID: " + searchId);
        }
    }
}
