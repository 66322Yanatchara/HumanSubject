import Personel.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        Student p = new Student();
        System.out.print("Enter Student ID: ");
        p.setId(sc.nextLine());
        System.out.print("Enter Student Name: ");
        p.setName(sc.nextLine());
        System.out.print("Enter your score : ");
        p.setScore(sc.nextInt());
        System.out.println(p.calculateGrade());

        Alumni prang = new Alumni();
        System.out.print("Enter your salary :");
        prang.setSalary(sc.nextInt());
        System.out.print("Enter your persen :");
        prang.setPersen(sc.nextInt());
        System.out.println(prang.computeGrade());


    }
}
