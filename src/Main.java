import Personel.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลนักเรียน
        Student s = new Student();
        System.out.print("Enter Student ID: ");
        s.setId(sc.nextLine());
        System.out.print("Enter Student Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter Student Score: ");
        s.setScore(sc.nextInt());
        sc.nextLine(); // เคลียร์ buffer

        // รับข้อมูลศิษย์เก่า
        Alumni alum = new Alumni();
        System.out.print("Enter Alumni ID: ");
        alum.setId(sc.nextLine());
        System.out.print("Enter Alumni Name: ");
        alum.setName(sc.nextLine());
        System.out.print("Enter Alumni Salary: ");
        alum.setSalary(sc.nextInt());

        // แสดงผลลัพธ์
        System.out.println("\n=== Student Information ===");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Score: " + s.getScore());

        System.out.println("\n=== Alumni Information ===");
        System.out.println("ID: " + alum.getId());
        System.out.println("Name: " + alum.getName());
        System.out.print("Occupation: ");
        alum.showOccupation();

        sc.close();
    }
}